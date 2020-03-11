import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập cạnh thứ nhất = ");
        float canhThuNhat = scanner.nextFloat();
        System.out.printf("Nhập cạnh thứ hai = ");
        float canhThuHai = scanner.nextFloat();
        System.out.printf("Nhập cạnh thứ ba = ");
        float canhThuBa = scanner.nextFloat();
        chuViTamGiac(canhThuNhat,canhThuHai,canhThuBa);
        dienTichTamGiac(canhThuNhat,canhThuHai,canhThuBa);
    }

    public static void chuViTamGiac(float canhThuNhat,float canhThuHai,float canhThuBa) {
        float chuVi = canhThuNhat + canhThuHai + canhThuBa;
        System.out.println("Chu vi hình tam giác là = " + chuVi);
    }

    public static void dienTichTamGiac(float canhThuNhat,float canhThuHai,float canhThuBa) {
        float p = (canhThuNhat + canhThuHai + canhThuBa)/2;
        double dienTich = Math.sqrt(p*(p-canhThuNhat)*(p-canhThuHai)*(p-canhThuBa));
        System.out.println("Diện tích hình tam giác là = " + dienTich);

    }
}
