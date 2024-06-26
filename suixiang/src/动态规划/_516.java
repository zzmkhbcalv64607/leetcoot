package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/8 9:44
 * @注释 最长回文子序列
 */
public class _516 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int [][]dp =new int[n][n];
        //dp[i][j]表示s[i:j]的最长回文子序列
        //递推公式：dp[i][j]=dp[i+1][j-1]+2  s[i]==s[j]
        //        dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1])
        //初始化
        for (int i = 0; i < n; i++) {
            dp[i][i]=1;
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j < n; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
