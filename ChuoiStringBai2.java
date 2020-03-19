import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class ChuoiStringBai2 {
    static String[] arrName = {"Le Duong Tuan Anh", "Luu Le Bao Yen", "Tran Van Than", "Nguyen Van Tanh", "Tran Van Ba", "Le Thi Bay",
            "Tran Ba Van Thin", "Le Thi Thuan", "Tran Thi Thu Hang", "Tran Ngoc Son"};
    static int[] firstPoint = {10, 3, 4, 6, 7, 8, 3, 5, 9, 10};
    static int[] secondPoint = {9, 6, 5, 8, 6, 8, 8, 9, 9, 10};
    static int[] thirdPoint = {9, 7, 3, 8, 4, 6, 9, 3, 10, 10};
    static int[] sumPoint = new int[10];

    public static void main(String[] args) {

        int i;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("|***|=================================MENU=================================|***|");
            System.out.println("1• Hiển thị danh sách vận động viên cùng với thành tích trong 3 lần cử tạ và tổng thành tích.");
            System.out.println("2• Hiển thị thông tin về vận động viên có tổng thành tích (tổng 3 lần cử tạ) cao nhất. ");
            System.out.println("3• Hiển thị 3 vận động viên có tổng thành tích cao nhất.");
            System.out.println("4• Sắp sếp danh sách vận động viên theo tên .");
            System.out.println("5• Hiển thị danh sách vận động viên có tên bắt đầu bằng chữ 'T'.");
            System.out.println("6• Hiển thị danh sách vận động viên mà tên có vấn \"an\" ");
            System.out.println("7• Sắp xếp danh sách vận động viên theo chiều dài của tên tăng dần. ");
            System.out.println("8• Hiển thị danh sách các vận động viên có cùng tổng thành tích");
            System.out.println("9• Hiển thị danh sách các vận động viên có lần cử tạ thứ 3 thấp nhất.");
            System.out.println("10• Hiển thị danh sách các vận động viên có lần cử tạ thứ nhất cao nhất.");
            System.out.println("0•Thoát ra.");
            System.out.println("Mời bạn chọn chức năng :");
            i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("|***|=============== Danh sách ===============|***|");
                    printAllInLine();
                    break;
                }
                case 2: {
                    System.out.println("Người có thành tích tốt nhất là :" );
                    maxPointPerson();
                    break;
                }
                case 3: {
                    System.out.println("3 Người có thành tích cao nhất là : ");
                    threePersonMaxPoint();
                    break;
                }
                case 4:{
                    System.out.println("|***|=============== Danh sách ===============|***|");
                    System.out.println("|***|=============== Hết ===============|***|");
                    sortNamePerson();
                    break;
                }
                case 5:{
                    System.out.println("Những vận động viên có tên bất đầu bằng chữ T là : ");
                    person_T();
                    break;
                }
                case 6:{
                    System.out.println("Những vận động viên tên có vần \"an\" là :");
                    printPerson_an();
                    break;
                }
                case 7:{
                    System.out.println("|***|=============== Danh sách ===============|***|");
                    sortNameByLength();
                    System.out.println("|***|=============== Hết ===============|***|");
                    break;
                }
                case 8 :{
                    System.out.println("Danh sách các vận động viên có cùng tổng thành tích là :");
                    equalPoint();
                    break;
                }
                case 9:{
                    System.out.println("Danh sách các vận động viên có lần cử tạ thứ 3 thấp nhất là :");
                    thirdPointMin();
                    break;
                }
                case 10 :{
                    System.out.println("Danh sách các vận động viên có lần cử tạ thứ nhất cao nhất là :");
                    firstPointMax();
                    break;
                }
                default:{
                    System.out.println("Mời bạn nhập lại : ");
                    break;
                }
            }
        }while (i != 0);
    }

    public static void sortNamePerson() {
        int i;
        String[] printInLine = new String[10];
        String temp = "";
        int temp1 = 0, temp2 = 0, temp3 = 0;
        int k;
        for (i = 0; i < arrName.length; i++) {
            for (int j = i + 1; j < arrName.length; j++) {
                k = sortName(arrName[j], arrName[i]);
                if (k < 0) {
                    temp = arrName[i];
                    arrName[i] = arrName[j];
                    arrName[j] = temp;

                    temp1 = firstPoint[i];
                    firstPoint[i] = firstPoint[j];
                    firstPoint[j] = temp1;

                    temp2 = secondPoint[i];
                    secondPoint[i] = secondPoint[j];
                    secondPoint[j] = temp2;

                    temp3 = thirdPoint[i];
                    thirdPoint[i] = thirdPoint[j];
                    thirdPoint[j] = temp3;
                }
            }
        }
        for (i = 0; i < 10; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
            printInLine[i] = arrName[i] + "\\Lần 1 :" + firstPoint[i] + "\\Lần 2 :" + secondPoint[i] +
                    "\\Lần 3 :" + thirdPoint[i] + " => Tổng : " + sumPoint[i];
            System.out.println(printInLine[i]);
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

    public static void equalPoint() {
        int i;
        for (i = 0; i < 10; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
        }
        int[] c = new int[10];
        int dem = 0;
        for (i = 0; i < 9; i++) {
            if (c[i] == 0) {
                dem = 0;
                c[i] = 1;
                for (int j = i + 1; j < 10; j++) {

                    if (c[j] == 0 && sumPoint[j] == sumPoint[i]) {
                        System.out.println("Vận động viên có cùng thành tích là: " + arrName[j] +
                                " với " + sumPoint[j] + " điểm ");
                        dem = 1;
                        c[j] = 1;
                    }
                }
                if (dem != 0) {
                    System.out.println("Vận động viên có cùng thành tích là: " + arrName[i] +
                            " với " + sumPoint[i] + " điểm ");
                }

            }
        }

    }

    public static void firstPointMax() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < 10; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
            printInLine[i] = arrName[i] + "\\Lần 1 :" + firstPoint[i] + "\\Lần 2 :" + secondPoint[i] +
                    "\\Lần 3 :" + thirdPoint[i] + " => Tổng : " + sumPoint[i];
        }
        int index1 = 0, index2 = 0;
        int max1 = firstPoint[0], max2 = firstPoint[0];
        for (i = 0; i < firstPoint.length; i++) {
            if (max1 < firstPoint[i]) {
                max1 = firstPoint[i];
                index1 = i;
            }
        }
        System.out.println(printInLine[index1]);
        for (i = 0; i < firstPoint.length; i++) {
            if (max2 <= firstPoint[i] && i != index1) {
                max2 = firstPoint[i];
                index2 = i;
            }
        }
        System.out.println(printInLine[index2]);

    }

    public static void thirdPointMin() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < 10; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
            printInLine[i] = arrName[i] + "\\Lần 1 :" + firstPoint[i] + "\\Lần 2 :" + secondPoint[i] +
                    "\\Lần 3 :" + thirdPoint[i] + " => Tổng : " + sumPoint[i];
        }
        int index1 = 0, index2 = 0, index3 = 0;
        int min1 = thirdPoint[0], min2 = thirdPoint[0], min3 = thirdPoint[0];
        for (i = 0; i < thirdPoint.length; i++) {
            if (min1 > thirdPoint[i]) {
                min1 = thirdPoint[i];
                index1 = i;
            }
        }
        System.out.println(printInLine[index1]);
        for (i = 0; i < thirdPoint.length; i++) {
            if (min2 > thirdPoint[i] && i != index1) {
                min2 = thirdPoint[i];
                index2 = i;
            }
        }
        System.out.println(printInLine[index2]);
        for (i = 0; i < thirdPoint.length; i++) {
            if (min3 > thirdPoint[i] && i != index2 && i != index1) {
                min3 = thirdPoint[i];
                index3 = i;
            }
        }
        System.out.println(printInLine[index3]);

    }

    public static void sortNameByLength() {
        int kT = 0;
        for (int i = 0; i < arrName.length; i++) {
            for (int j = 0; j < arrName.length; j++) {
                if (arrName[i].length() < arrName[j].length()) {
                    String temp = arrName[i];
                    arrName[i] = arrName[j];
                    arrName[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }
    }

    public static void printPerson_an() {
        int i, kt = 0;
        for (i = 0; i < arrName.length; i++) {
            kt = find_an(arrName[i]);
            if (kt != 0) {
                System.out.println(arrName[i]);
            }
        }
    }

    public static int find_an(String a) {
        String[] list = a.split(" ");
        int i = list[list.length - 1].indexOf("an");
        if (i > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void printAllInLine() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < arrName.length; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
            printInLine[i] = arrName[i] + "\\Lần 1 : " + firstPoint[i] + "\\Lần 2 :" + secondPoint[i] +
                    "\\Lần 3: " + thirdPoint[i] + " => Tổng : " + sumPoint[i];
            System.out.println(printInLine[i]);
        }
    }

    public static void maxPointPerson() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < 10; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
            printInLine[i] = arrName[i] + "\\Lần 1 :" + firstPoint[i] + "\\Lần 2 :" + secondPoint[i] +
                    "\\Lần 3 :" + thirdPoint[i] + " => Tổng : " + sumPoint[i];
        }
        int index = 0;
        int max = sumPoint[0];
        for (i = 0; i < sumPoint.length; i++) {
            if (sumPoint[i] > max) {
                max = sumPoint[i];
                index = i;
            }
        }
        System.out.println(printInLine[index]);

    }

    public static void person_T() {
        int i, kt = 0;
        for (i = 0; i < arrName.length; i++) {
            kt = findPerson_T(arrName[i]);
            if (kt == 1) {
                System.out.println(arrName[i]);
            }
        }
    }

    public static int findPerson_T(String a) {
        String[] list = a.split(" ");
        int i = list[list.length - 1].indexOf("T");
        if (i == 0)
            return 1;
        else
            return 0;
    }

    public static void threePersonMaxPoint() {
        int i;
        String[] printInLine = new String[10];
        for (i = 0; i < 10; i++) {
            sumPoint[i] = firstPoint[i] + secondPoint[i] + thirdPoint[i];
            printInLine[i] = arrName[i] + "\\Lần 1 : " + firstPoint[i] + "\\Lần 2 : " + secondPoint[i] +
                    "\\Lần 3 : " + thirdPoint[i] + " => Tổng : " + sumPoint[i];
        }
        int index1 = 0, index2 = 0, index3 = 0;
        int max1 = sumPoint[0], max2 = sumPoint[0], max3 = sumPoint[0];
        for (i = 0; i < sumPoint.length; i++) {
            if (sumPoint[i] > max1) {
                max1 = sumPoint[i];
                index1 = i;
            }
        }
        System.out.println(printInLine[index1]);
        for (i = 0; i < sumPoint.length; i++) {
            if (sumPoint[i] > max2 && i != index1) {
                max2 = sumPoint[i];
                index2 = i;
            }
        }
        System.out.println(printInLine[index2]);
        for (i = 0; i < sumPoint.length; i++) {
            if (sumPoint[i] > max3 && i != index2 && i != index1) {
                max3 = sumPoint[i];
                index3 = i;
            }
        }
        System.out.println(printInLine[index3]);
    }


}
