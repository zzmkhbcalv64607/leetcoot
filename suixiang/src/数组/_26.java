package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 16:22
 * @注释  删除有序数组中的重复项
 */
public class _26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=nums[flag]){
                flag++;
                nums[flag]=nums[i];
            }
        }
        return flag+1;
    }

}
