import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập chiều cao = ");
        float chieuCao = scanner.nextFloat();
        System.out.printf("Nhập đáy lớn = ");
        float dayLon = scanner.nextFloat();
        System.out.printf("Nhập đáy bé = ");
        float dayBe = scanner.nextFloat();
        float dienTichHinhThang= ((dayBe + dayLon)*chieuCao)/2;
        System.out.println("Dien tich hinh thang =" + dienTichHinhThang);


    }
}
