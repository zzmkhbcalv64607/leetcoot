package digui;

public class _62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 4));
    }

    public static int uniquePaths(int m, int n) {
        if (m==1||n==1) return 1;
        int dp[][] = new int[m][n];
        for (int i = 1; i < m; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < n; i++) {
            dp[0][i]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int i1 = 1; i1 < n; i1++) {
                dp[i][i1]=dp[i-1][i1]+dp[i][i1-1];
            }
        }
        return dp[m-1][n-1];
    }
}
