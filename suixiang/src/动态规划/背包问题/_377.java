package 动态规划.背包问题;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/31 9:47
 * @注释 组合总和 Ⅳ
 */
public class _377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
