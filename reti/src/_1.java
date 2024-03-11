import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/6 9:42
 * @注释 两数之和
 */
public class _1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
