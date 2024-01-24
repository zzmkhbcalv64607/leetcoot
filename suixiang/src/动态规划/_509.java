package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/23 10:01
 * @注释 斐波那契数
 */
public class _509 {
    public static void main(String[] args) {
        System.out.println(new _509().fib(5));
    }
    public int fib(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 2];
        dp[0]=0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i -1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
