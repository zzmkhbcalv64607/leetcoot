package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 10:01
 * @注释 搜索插入位置
 */
public class _35 {

        public static void main(String[] args) {
            _35 test = new _35();
            System.out.println(test.searchInsert(new int[]{1, 3, 5, 6}, 5));
            System.out.println(test.searchInsert(new int[]{1, 3, 5, 6}, 2));
            System.out.println(test.searchInsert(new int[]{1, 3, 5, 6}, 7));
            System.out.println(test.searchInsert(new int[]{1, 3, 5, 6}, 0));
            System.out.println(test.searchInsert(new int[]{1}, 0));
        }

        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1, mid;
            while (left<=right){
                mid=left+(right-left)/2;
              if (nums[mid]>target){
                    right=mid-1;
                }else if (nums[mid]<target){
                    left =mid+1;
                }  else if (target==nums[mid]){
                    return mid;
                }
            }
            return  right+1;
        }
}
