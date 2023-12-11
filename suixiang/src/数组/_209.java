package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 16:53
 * @注释 长度最小的子数组
 */
public class _209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(new _209().minSubArrayLen(7, nums));
    }

    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;


    }
}
