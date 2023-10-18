package easy;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class _35 {
    public static void main(String[] args) {
        _35 test = new _35();
        int[] nums = {1,3,5,6};
        int target = 2;
        int result = test.searchInsert(nums, target);
        System.out.println(result);
    }
    public int searchInsert(int[] nums, int target) {
        int left=0,right= nums.length-1;
        if (nums[nums.length-1]<target){
            return nums.length;
        }
        while (left<=right){
            int flag = (left+right)/2;
            if (target==nums[flag]){
                return flag;
            } else if (target < nums[flag]) {
                right =flag-1;
            }else {
                left =flag+1;
            }
        }
        return  left;
    }
}
