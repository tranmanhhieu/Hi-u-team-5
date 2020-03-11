import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Bai7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hiển thị chuỗi : " +nhapChuoi());
    }
    public static String nhapChuoi(){
        System.out.println("Nhập chuỗi : ");
        return scanner.nextLine();
    }
}
