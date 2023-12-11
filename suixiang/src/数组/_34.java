package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 10:37
 * @注释 在排序数组中查找元素的第一个和最后一个位置
 */
public class _34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(searchRange(nums, 8));
    }

    public  static int[] searchRange(int[] nums, int target) {
    int[] res = {-1, -1};
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            // 找到了目标值，向左右两边扩散
            int l = mid, r = mid;
            while (l >= 0 && nums[l] == target) {
                l--;
            }
            while (r < nums.length && nums[r] == target) {
                r++;
            }
            res[0] = l + 1;
            res[1] = r - 1;
            break;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        }
    }

        return res;
    }
}
