package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/12 11:15
 * @注释 最长定差子序列
 */
public class _1218 {

    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        int[] dp = new int[n];
        //dp[i]表示以arr[i]结尾的最长定差子序列
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] - arr[j] == difference) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
