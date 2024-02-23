package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/11 9:33
 * @注释  交错字符串
 */
public class _97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int t = s3.length();
        if (m + n != t) {
            return false;
        }
        boolean[][] dp = new boolean[m+1][n+1];
        //dp[i][j]表示s1的前i个字符和s2的前j个字符是否交错组成s3的前i+j个字符
        //递推公式：dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) || (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1))
        dp[0][0] = true;
        for (int i = 1; i <= m && s1.charAt(i-1) == s3.charAt(i-1); i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n && s2.charAt(i-1) == s3.charAt(i-1); i++) {
            dp[0][i] = true;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) || (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
            }
        }
        return dp[m][n];
    }
}
