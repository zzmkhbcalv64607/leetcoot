package vrtodp;

public class _264 {
    public static void main(String[] args) {
        _264 sol = new _264();
        System.out.println(sol.nthUglyNumber(10));
    }
    public int nthUglyNumber(int n) {
        int ans = 0;
        int[] dp = new int[n];
        dp[0]=1;
        for (int i = 1,q=0,w=0,e=0; i < n; i++) {
            int a= dp[q] * 2;
            int b= dp[w] * 3;
            int c= dp[e] * 5;
            dp[i] = Math.min(a,Math.min(b,c));
            if (a ==    dp[i]) {
                q++;

            }
            if (b ==    dp[i]) {
               w++;

            }
            if (c==    dp[i]) {
                e++;

            }
            ans = dp[i];
        }
        return ans;
    }
}
