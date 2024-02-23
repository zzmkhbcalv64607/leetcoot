package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/12 11:20
 * @注释 俄罗斯套娃信封问题
 */
public class _654 {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        int res = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }

}
