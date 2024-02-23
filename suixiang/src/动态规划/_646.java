package 动态规划;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/12 9:48
 * @注释 最长数对链
 */
public class _646 {

    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        int[] dp = new int[n];
        //dp[i]表示以pairs[i]结尾的最长数对链
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
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
