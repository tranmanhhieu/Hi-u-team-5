import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất : ");
        int soThuNhat = scanner.nextInt();
        System.out.println("Nhập số thứ hai : ");
        int soThuHai = scanner.nextInt();
        System.out.println("Nhập số thứ ba : ");
        int soThuBa = scanner.nextInt();
        int n = maxOfTwoNum(soThuNhat,soThuHai);
        int m = maxOfTwoNum(n,soThuBa);
        System.out.println("Max của ba số là : " + m );
    }

    public static int maxOfTwoNum(int a, int b) {
        return (a > b ? a : b);
    }
    }

