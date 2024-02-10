package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/10 9:43
 * @注释 乘积最大子数组
 */
public class _152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] maxF = new int[n];
        //maxF[i]表示以nums[i]结尾的最大乘积
        int[] minF = new int[n];
        //minF[i]表示以nums[i]结尾的最小乘积
        maxF[0] = nums[0];
        minF[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxF[i] = Math.max(maxF[i-1]*nums[i],Math.max(nums[i],minF[i-1]*nums[i]));
            minF[i] = Math.min(minF[i-1]*nums[i],Math.min(nums[i],maxF[i-1]*nums[i]));
        }
        int res = maxF[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res,maxF[i]);
        }
        return res;
    }
}
