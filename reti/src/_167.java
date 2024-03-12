import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 20:15
 * @注释 两数之和 II - 输入有序数组
 */
public class _167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new _167().twoSum(numbers, target)));
    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
