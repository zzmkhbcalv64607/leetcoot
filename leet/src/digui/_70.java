package digui;

public class _70 {
    public static void main(String[] args) {
        _70 sol = new _70();
        System.out.println(sol.climbStairs(3));
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 2; i <= n; i++) {
            dp[n]=dp[n-1]+dp[n-2];
        }
        return dp[n];
    }
}
