package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/12 11:17
 * @注释 最长等差数列
 */
public class _1027 {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int res = 0;
        int[][] dp = new int[n][20001];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 20001; j++) {
                dp[i][j] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j] + 10000;
                dp[i][d] = dp[j][d] + 1;
                res = Math.max(res,dp[i][d]);
            }
        }
        return res;

    }
}
