package 数组;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 16:45
 * @注释 有序数组的平方
 */
public class _977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
