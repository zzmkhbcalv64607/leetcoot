package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/14 9:12
 * @注释 让字符串成为回文串的最少插入次数
 */
public class _1312 {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        //dp[i][j] 表示 s[i..j] 中最少需要插入多少个字符可以变成回文串
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[0][n - 1];
    }
}
