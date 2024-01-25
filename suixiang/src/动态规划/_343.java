package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/25 9:44
 * @注释 整数拆分
 */
public class _343 {

        public int integerBreak(int n) {
            //dp[i] 为正整数 i 拆分后的结果的最大乘积
            int[] dp = new int[n+1];
            dp[2] = 1;
            for(int i = 3; i <= n; i++) {
                for(int j = 1; j <= i-j; j++) {

                    dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));

                }
            }
            return dp[n];
        }

}
