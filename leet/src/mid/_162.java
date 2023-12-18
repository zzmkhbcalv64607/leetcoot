package mid;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/18 9:53
 * @注释 寻找峰值 峰值元素是指其值严格大于左右相邻值的元素。
 */
public class _162 {
    public static void main(String[] args) {
        _162 test = new _162();
        int[] nums = {1,2,3,1};
        System.out.println(test.findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
       int mid =1;
       while (mid<nums.length-1){
              if (nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
              }
              mid++;
       }
         return nums[0]>nums[nums.length-1]?0:nums.length-1;
    }
}
