package digui;

public class _115 {
    public static void main(String[] args) {
        System.out.println(numDistinct("rabbbit", "rabbit"));
    }

    public static int numDistinct(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        int n = charArray.length;
        int m = charArray1.length;
        int [][] dp = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m; j++) {
                if (charArray[i-1]==charArray1[j-1]){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
return dp[n][m];
    }
}
