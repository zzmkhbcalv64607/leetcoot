package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/5 9:46
 * @注释 最长公共子序列
 */
public class _1143 {
    public static void main(String[] args) {
        _1143 test = new _1143();
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(test.longestCommonSubsequence(text1, text2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp =new int[n][m];
        int res = 0;
        //dp[i][j]表示text1[0:i]和text2[0:j]的最长公共子序列的长度
        //递推公式 dp[i][j]=dp[i-1][j-1]+1  text1[i]==text2[j]
        //dp[i][j]=max(dp[i-1][j],dp[i][j-1])  text1[i]!=text2[j]
        for (int i = 0; i < n; i++) {
            char c1 = text1.charAt(i);
            for (int j = 0; j < m; j++) {
                char c2 = text2.charAt(j);
                if (c1 == c2) {
                    dp[i][j] = (i > 0 && j > 0 ? dp[i - 1][j - 1] : 0) + 1;
                } else {
                    dp[i][j] = Math.max(i > 0 ? dp[i - 1][j] : 0, j > 0 ? dp[i][j - 1] : 0);
                }
                System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);

            }
        }
        return  dp[n-1][m-1];
    }
}
