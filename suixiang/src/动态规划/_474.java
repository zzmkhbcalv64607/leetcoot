package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/29 9:50
 * @注释 一和零
 */
public class _474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];//dp[i][j]表示i个0和j个1的最大子集
        for (String str : strs) {
            int[] count = countZeroAndOne(str);
            for (int i = m; i >= count[0]; i--) {//从后往前遍历
                for (int j = n; j >= count[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-count[0]][j-count[1]]+1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] countZeroAndOne(String str) {
        int[] count = new int[2];
        for (char c : str.toCharArray()) {
            count[c-'0']++;
        }
        return count;
    }
}
