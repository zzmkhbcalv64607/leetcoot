package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/14 9:17
 * @注释 解决智力问题
 */
public class _2140 {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[][] dp = new long[n][3];
        //dp[i][0] 表示第 i 个问题不回答
        //dp[i][1] 表示第 i 个问题回答正确
        //dp[i][2] 表示第 i 个问题回答错误
        dp[0][0] = 0;
        dp[0][1] = questions[0][0];
        dp[0][2] = questions[0][1];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + questions[i][0];
            dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + questions[i][1];
        }
        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}
