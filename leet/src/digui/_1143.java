package digui;

/**
 * 最长公共子序列
 * 给定两个字符串text1和text2
 * 返回这两个字符串的最长 公共子序列 的长度
 * 如果不存在公共子序列，返回0
 * 两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列
 */
public class _1143 {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        char[] charArray = text1.toCharArray();
        char[] charArray1 = text2.toCharArray();
        int n = charArray.length;
        int m = charArray1.length;
//        int dp[][] = new int[n+1][m+1];
//        int i = f1(charArray, charArray1, n, m,dp);
        int i = f2(charArray, charArray1, n, m);
        return i;

    }

    /**
     * 缓存表和递归超时
     * @param charArray
     * @param charArray1
     * @param n
     * @param m
     * @param dp
     * @return
     */
    public static int f1(char[] charArray,char[] charArray1,int n,int m,int [][] dp){
        if (n<=0||m<=0){
            return 0;
        }
        if (dp[n][m]!=0){
            return dp[n][m];
        }
        int ans = 0;
        if (charArray[n-1]==charArray1[m-1]){
            ans=f1(charArray,charArray1,n-1,m-1,dp)+1;

        }
        if (charArray[n-1]!=charArray1[m-1]){
          ans=  Math.max(f1(charArray,charArray1,n-1,m,dp),f1(charArray,charArray1,n,m-1,dp));

        }
        dp[n][m]=ans;
        return dp[n][m];
    }

    /**
     * 动态规划
     * @param charArray
     * @param charArray1
     * @param n
     * @param m
     * @return
     */
    public static int f2(char[] charArray,char[] charArray1,int n,int m){
        int dp[][] = new int[n+1][m+1];

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m; j++) {
                if (charArray[i-1]==charArray1[j-1]) {
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[n][m];
    }
}
