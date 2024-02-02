package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/31 10:06
 * @注释 完全平方数
 */
public class _279 {
    public int numSquares(int n) {
        int[] num ={1,4,9};
        int[][] dp = new int[num.length+1][n+1];
        //dp[i][j]表示使用前i个完全平方数，凑成总和为j的最少个数
        //递推公式： min(dp[i-1][j],dp[i][j-num[i-1]]+num[i])
        //dp[i-1][j]表示不使用第i个完全平方数，凑成总和为j的最少个数
        //dp[i][j-num[i-1]]+num[i]表示使用第i个完全平方数，凑成总和为j的最少个数
        //初始化dp数组
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i <= num.length; i++) {
            dp[i][0] = 0;
        }
        for(int i = 1; i <= num.length; i++) {
            for(int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j];
                if(j >= num[i-1] && dp[i][j-num[i-1]] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-num[i-1]]+1);
                }
            }
        }
        return dp[num.length][n];
    }
}
