import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất =");
        int soThuNhat = scanner.nextInt();
        System.out.println("Nhập số thứ hai =");
        int soThuHai = scanner.nextInt();
        System.out.println("Nhập số thứ ba =");
        int soThuBa = scanner.nextInt();
        System.out.println("Nhập số thứ tư =");
        int soThuTu = scanner.nextInt();
        int a = uCLN(soThuNhat,soThuHai);
        int b = uCLN(soThuBa,a);
        int c = uCLN(soThuTu,b);
        System.out.println("Ước chung lớn nhất = " + c );
    }

    public static int uCLN(int x, int y) {
        if (x%y == 0)
            return y;
        else
            return uCLN(y,x%y);

    }
}
