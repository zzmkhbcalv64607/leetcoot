package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 9:55
 * @注释 二分查找
 */
public class _704 {

    public static void main(String[] args) {
        _704 test = new _704();
        System.out.println(test.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));

    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while(left <= right){
            mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

}
