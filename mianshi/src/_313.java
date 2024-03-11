/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/5 9:53
 * @注释 超级丑数
 */
public class _313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        //递推公式 dp[i] = min(dp[pointers[0]]*primes[0],dp[pointers[1]]*primes[1],dp[pointers[2]]*primes[2],...)
        dp[0] = 1;
        int[] pointers = new int[primes.length];
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                if (dp[pointers[j]] * primes[j] < min) {
                    min = dp[pointers[j]] * primes[j];
                }
            }
            dp[i] = min;
            for (int j = 0; j < primes.length; j++) {
                if (dp[pointers[j]] * primes[j] == min) {
                    pointers[j]++;
                }
            }
        }
        return dp[n - 1];
    }
}
