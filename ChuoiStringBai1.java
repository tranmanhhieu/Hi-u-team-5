import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ChuoiStringBai1 {
    final static int moneyOfOnePow = 3400;
    static String[] arrName = {"Trần Văn Truong", "Trần Thị Truong", "Trần Truong Ba", "Trần Văn Bốn", "Trần Văn Năm", "Trần Bính Sáu", "Đỗ Nhật Nam",
            "Trần Văn Tám", "Truong Văn Chín", "Lệ Quỳnh Truong"};
    static int[] powNumOnMonth = {5, 13, 6, 12, 10, 16, 27, 18, 29, 11};
    static int[] money = new int[10];


    public static void main(String[] args) {
        int i;
        do {
            System.out.println("|***|==============================MENU==============================|***|");
            System.out.println(" 1 • Hiển thị danh sách các hộ gia đình cùng với số kwh điện tiêu thụ và\n" +
                    "số tiền phải trả, mỗi hộ gia đình trên 1 dòng.");
            System.out.println(" 2 • Hiển thị 3 hộ gia đình có số kwh điện tiêu thụ nhiều nhất.");
            System.out.println(" 3 • Hiển thị các hộ gia đình có chủ hộ tên Truong ");
            System.out.println(" 4 • Sắp danh sách các hộ gia đình theo tên với thứ tự bảng chữ cái");
            System.out.println(("0 • Thoát ra ! "));
            System.out.println("Mời bạn nhập số : ");
            Scanner scanner = new Scanner(System.in);
             i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("|***|=============== Danh sách ===============|***|");
                    printAllInLine();
                    break;
                }
                case 2: {
                    System.out.println("Ba hộ dùng nhiều số điện nhất là : ");
                    threeFamilyUseMax();
                    break;
                }
                case 3: {
                    System.out.println("Những nhà có chủ hộ tên Truong là :");
                    findTruong();
                    break;
                }
                case 4: {
                    System.out.println("|***| =========== Danh sách theo tứ tự bảng chữ cái =========== |***| ");
                    sortFamilyByName();
                    break;
                }
                default: {
                    System.out.println("Mời bạn nhập lại : ");
                    break;
                }
            }
        }while (i != 0);
    }

    public static void sortFamilyByName() {
        int i;
        String temp = "";
        String[] nameSort = new String[10];
        for (i = 0; i < arrName.length; i++) {
            for (int j = i + 1; j < arrName.length; j++) {
                if (sortName(arrName[j], arrName[i]) < 0) {
                    temp = arrName[i];
                    arrName[i] = arrName[j];
                    arrName[j] = temp;
                }
            }
        }
        for (i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }
    }

    public static int sortName(@org.jetbrains.annotations.NotNull String a, @NotNull String b) {

        String[] listA = a.split(" ");
        String[] listB = b.split(" ");
        String[] list1 = new String[2];
        String[] list2 = new String[2];
        int kt = 0, k = 0;
        int i;
//        Tách tên và họ , sau đó đảo ngược thứ tự họ và gán vào 1 mảng mới chứa tên trước , họ sau
        for (i = listA.length - 1; i >= 0; i--) {
            if (i == listA.length - 1 || i == 0) {
                list1[kt] = listA[i];
                kt++;
            }
        }

        for (i = listB.length - 1; i >= 0; i--) {
            if (i == listB.length - 1 || i == 0) {
                list2[k] = listB[i];
                k++;
            }
        }
//        So sánh 2 chuỗi mới chỉ gồm họ và tên
        int kq1 = list1[0].compareTo(list2[0]);
        int kq2 = list1[1].compareTo(list2[1]);

        if (kq1 > 0) {
            return 1;
        } else if (kq1 == 0) {
            if (kq2 > 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }

    }

    public static void findTruong() {
        int i, kt = 0;

        String s = "Truong";
        for (i = 0; i < arrName.length; i++) {
            kt = find_Truong(arrName[i]);
            if (kt == 1) {
                System.out.println(arrName[i]);
            }
        }
    }

    public static int find_Truong(String a) {
        String[] list = a.split(" ");
        int i = list[list.length - 1].compareTo("Truong");
        if (i == 0)
            return 1;
        else
            return 0;
    }

    public static void printAllInLine() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < 10; i++) {
            money[i] = powNumOnMonth[i] * moneyOfOnePow;
            printInLine[i] = arrName[i] + "   " + powNumOnMonth[i] + "   " + money[i];
            System.out.println(printInLine[i]);
        }
    }

    public static void threeFamilyUseMax() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < 10; i++) {
            money[i] = powNumOnMonth[i] * moneyOfOnePow;
            printInLine[i] = arrName[i] + "   " + powNumOnMonth[i] + "   " + money[i];
        }
        int index1 = 0, index2 = 0, index3 = 0;
        int max = powNumOnMonth[0], max1 = powNumOnMonth[0], max2 = powNumOnMonth[0];
        for (i = 0; i < powNumOnMonth.length; i++) {
            if (powNumOnMonth[i] > max) {
                max = powNumOnMonth[i];
                index1 = i;
            }
        }
        System.out.println(printInLine[index1]);
        for (i = 0; i < powNumOnMonth.length; i++) {
            if (powNumOnMonth[i] > max1 && i != index1) {
                max1 = powNumOnMonth[i];
                index2 = i;
            }
        }
        System.out.println(printInLine[index2]);
        for (i = 0; i < powNumOnMonth.length; i++) {
            if (powNumOnMonth[i] > max2 && i != index1 && i != index2) {
                max2 = powNumOnMonth[i];
                index3 = i;
            }
        }
        System.out.println(printInLine[index3]);
    }

}
