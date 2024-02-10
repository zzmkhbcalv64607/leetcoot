package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/6 9:30
 * @注释  判断子序列
 */
public class _392 {
    public static void main(String[] args) {
        _392 test = new _392();
        System.out.println(test.isSubsequence("abc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        int n = s.length();//子序列长度
        int m = t.length();//字符串长度
        int[][] dp = new int[n+1][m+1];
        //dp[i][j]表示s的前i个字符是否是t的前j个字符的子序列
        //递推公式： dp[i][j]=dp[i-1][j-1]  s[i-1]==t[j-1]
        //          dp[i][j]=dp[i][j-1]

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1]+1;
                } else {
                    dp[i][j] = dp[i][j - 1] ;
                }
              //  System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);
            }
        }
        return dp[n ][m ] == n;

    }
}
