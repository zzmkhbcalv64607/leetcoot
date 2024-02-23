/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/17 16:39
 * @注释
 */
public class _198 {
    public int rob(int[] nums) {
        int []dp = new int[nums.length];
        //递推公式 dp[i] = max(dp[i-1],dp[i-2]+nums[i])
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
