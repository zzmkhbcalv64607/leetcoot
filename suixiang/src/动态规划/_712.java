package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/9 9:59
 * @注释 两个字符串的最小ASCII删除和
 */
public class _712 {

    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int [][] dp = new int[s1.length()+1][s2.length()+1];
        //dp[m][n]:删除s1的m个字符和s2的n个字符使得两个字符串相等的最小ASCII值
        //递推公式： dp[i][j] = s1[i-1] == s2[j-1] ? dp[i-1][j-1] : Math.min(dp[i-1][j]+s1[i-1],dp[i][j-1]+s2[j-1]);
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i-1][0] + s1.charAt(i-1);
        }
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i-1] + s2.charAt(i-1);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = s1.charAt(i-1) == s2.charAt(j-1) ? dp[i-1][j-1] : Math.min(dp[i-1][j]+s1.charAt(i-1),dp[i][j-1]+s2.charAt(j-1));
            }
        }
        return dp[m][n];
    }
}
