/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/17 16:42
 * @注释
 */
public class _279 {

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        //递推公式 dp[i] = min(dp[i],dp[i-j*j]+1) 含义是 i 的最少平方数个数等于 i-j*j 的最少平方数个数加 1
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i-j*j >= 0; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
