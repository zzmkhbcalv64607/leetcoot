package 动态规划;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/4 10:06
 * @注释 最长递增子序列
 */
public class _300 {
    public static void main(String[] args) {
        _300 test = new _300();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(test.lengthOfLIS(nums));
    }
    public int lengthOfLIS1(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            int pre = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > pre) {
                    temp++;
                    pre = nums[j];
                }
            }
            res = Math.max(res, temp);
        }
        return res;
    }
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;


    }
}
