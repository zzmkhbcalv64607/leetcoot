package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/6 10:06
 * @注释 不同的子序列
 */
public class _115 {
    public static void main(String[] args) {
        _115 test = new _115();
        System.out.println(test.numDistinct("rabbbit", "rabbit"));
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int [][]dp = new int[n+1][m+1];
        //dp[i][j]表示s的前i个字符中t的前j个字符出现的次数
        //递推公式 dp[i][j]=dp[i-1][j-1]+dp[i-1][j]  s[i-1]==t[j-1]
        //          dp[i][j]=dp[i-1][j]  s[i-1]!=t[j-1]
        for (int i = 0; i < s.length() + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
               // System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);
            }
        }
        return dp[n][m];
    }
}
