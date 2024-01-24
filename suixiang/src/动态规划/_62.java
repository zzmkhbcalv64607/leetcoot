package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/24 9:55
 * @注释 不同路径
 */
public class _62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //递归公式 dp[m][n]=dp[m-1][n]+dp[n-1][m]
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}
