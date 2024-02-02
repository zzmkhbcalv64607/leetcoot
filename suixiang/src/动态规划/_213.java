package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/1 9:58
 * @注释 打家劫舍 II
 */
public class _213 {

    public int rob(int[] nums) {
        int []dp =new int[nums.length+1];
        if (nums.length==1){
            return nums[0];
        }
        //dp[i]是指前i个房子能偷到的最大金额，dp[i-1]是指在前i-1个房子能偷到的最大金额
        //递推公式是：dp[i]=max(dp[i-1],dp[i-2]+nums[i-1])
        //因为是环形，所以分两种情况，一种是偷第一家，一种是不偷第一家
        //偷第一家，那么最后一家就不能偷，所以dp[nums.length-1]=dp[nums.length-2]\
        //不偷第一家，那么最后一家可以偷，所以dp[nums.length]=dp[nums.length-1]
        dp[0]=0;
        dp[1]=nums[0];
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        int max1=dp[nums.length-1];
        dp[0]=0;
        dp[1]=0;
        for (int i = 2; i <= nums.length; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        int max2=dp[nums.length];
        return Math.max(max1,max2);

    }
}
