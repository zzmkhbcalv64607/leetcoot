package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/7 9:24
 * @注释 两个字符串的删除操作
 */
public class _583 {
    public static void main(String[] args) {
        _583 test = new _583();
        System.out.println(test.minDistance("sea", "eat"));
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [][]dp =new int[n+1][m+1];
        //dp[i][j]表示word1的前i个字符和word2的前j个字符的最小删除次数
        //递推公式：dp[i][j]=dp[i-1][j-1]  word1[i-1]==word2[j-1]
        //        dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+1
        //        dp[i][j]=Math.min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]+2)
        //初始化
        for (int i = 0; i <= n; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+2);
                }
                System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);
            }
        }
        return dp[n][m];
    }
}
