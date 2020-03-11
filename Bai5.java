import java.util.Scanner;

public class Bai5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n : ");
        int n;
        n = scanner.nextInt();
        System.out.println("Số fibonacci thứ n là :" + fibonacci(n));
    }

    public static int fibonacci(int n) {
            if( n==1 || n==2 )
                return 1;
            else
                return fibonacci(n-1) + fibonacci(n-2);

            }
    }


