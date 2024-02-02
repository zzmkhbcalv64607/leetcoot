package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/1 9:50
 * @注释 打家劫舍
 */
public class _198 {
    public int rob(int[] nums) {
        int []dp = new int[nums.length + 1];
        //dp[i]是指前i个房子能偷到的最大金额，dp[i-1]是指在前i-1个房子能偷到的最大金额
        //递推公式：dp[i]=max(dp[i-1],dp[i-2]+nums[i-1])
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }
}
