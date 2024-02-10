/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/7 9:44
 * @注释 编辑距离
 */
public class _72 {

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int [][]dp =new int[n+1][m+1];
        //dp[i][j]表示word1的前i个字符和word2的前j个字符的最小编辑距离
        //递推公式：dp[i][j]=dp[i-1][j-1]  word1[i-1]==word2[j-1]
        //        dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])+1
        //dp[i-1][j]表示删除word1的第i个字符
        //dp[i][j-1]表示在word1的第i个字符后面插入一个字符
        //dp[i-1][j-1]表示替换word1的第i个字符
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
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
                System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);
            }
        }
        return dp[n][m];

    }
}
