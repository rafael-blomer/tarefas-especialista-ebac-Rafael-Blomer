import java.util.Scanner;

public class BottomUp {

    public static long fatorialBottomUp(long n) {
        long[] dp = new long[(int) n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }

        return dp[(int) n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fatorialBottomUp(sc.nextLong()));
        sc.close();
    }
}
