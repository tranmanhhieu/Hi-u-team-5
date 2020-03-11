import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int i=0;
        System.out.println("Hiển thị = " + nhapXuat(i));
    }

    public static int nhapXuat(int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kì = ");
        i = scanner.nextInt();
        return i;
    }
}
