package 数组;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 16:31
 * @注释 移动零
 */
public class _283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int slow=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
              //  int temp=nums[slow];
                nums[slow]=nums[i];
               // nums[i]=temp;
                slow++;
            }
        }
        while (slow<nums.length){
            nums[slow]=0;
            slow++;
        }
    }
}
