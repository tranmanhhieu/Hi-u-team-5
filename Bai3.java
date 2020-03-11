
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập bán kính = ");
        float r = scanner.nextFloat();
        double chuVi = 2*r*3.14;
        double dienTich = r*r*3.14;
        System.out.println("Chu vi hình tròn = " + chuVi);
        System.out.println("Diện tích hình tròn = " + dienTich);
    }
}
