import java.util.Scanner;

public class Main {

    public static long fatorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fatorial(sc.nextInt()));
    }
}