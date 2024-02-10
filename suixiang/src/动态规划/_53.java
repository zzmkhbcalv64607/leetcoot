package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/5 10:35
 * @注释 最大子数组和
 */
public class _53 {
    public static void main(String[] args) {
        _53 test = new _53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int [] dp =new int[n];
        // dp[i]表示以nums[i]结尾的最大子数组和
        // dp[i]=max(dp[i-1]+nums[i],nums[i])
        dp[0]=nums[0];
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            res=Math.max(res,dp[i]);
            //System.out.println("i = " + i + ", dp[i] = " + dp[i]);
        }
        return res;
    }
}
