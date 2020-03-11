import java.util.Scanner;

public class Bai8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hiển thị : " + nhapHoTen());
        System.out.println(diaChi());
        System.out.println(tuoi());
        scanner.nextLine();
        System.out.println(soDienThoai());
        System.out.println(diemToan());
        System.out.println(diemLy());
        System.out.println(diemHoa());
    }
    public static String nhapHoTen(){
        System.out.println("Nhập họ tên : ");
        return scanner.nextLine();
    }
    public static String diaChi(){
        System.out.println("Nhập địa chỉ : ");
        return scanner.nextLine();
    }
    public static int tuoi(){
        System.out.println("Nhập tuổi : ");
        return scanner.nextInt();
    }
    public static String soDienThoai(){
        System.out.println("Nhập số điện thoại : ");
        return scanner.nextLine();
    }
    public static int diemToan(){
        System.out.println("Nhập điểm toán : ");
        return scanner.nextInt();
    }
    public static int diemLy(){
        System.out.println("Nhập điểm lý : ");
        return scanner.nextInt();
    }
    public static int diemHoa(){
        System.out.println("Nhập điểm Hóa : ");
        return scanner.nextInt();
    }
}