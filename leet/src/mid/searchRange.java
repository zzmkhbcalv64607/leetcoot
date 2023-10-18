package mid;

import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        searchRange s = new searchRange();
        int[] ints = s.searchRange1(new int[]{5,7,7,8,8,10}, 8);
        System.out.println(Arrays.toString(ints));
    }

    public int[] searchRange1(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }

        int firstPosition = findFirstPosition(nums, target);
        if (firstPosition == -1) {
            return new int[]{-1, -1};
        }

        int lastPosition = findLastPosition(nums, target);
        return new int[]{firstPosition, lastPosition};
    }

    private int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 小于一定不是解
            if (nums[mid] < target) {
                // 下一轮搜索区间是 [mid + 1..right]
                left = mid + 1;
            } else {
                // nums[mid] >= target，下一轮搜索区间是 [left..mid]
                right = mid;
            }
        }

        // 退出循环以后不能确定 nums[left] 是否等于 target，因此需要再判断一次
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    private int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                // 下一轮搜索区间是 [left..mid - 1]
                right = mid - 1;
            } else {
                // 下一轮搜索区间是 [mid..right]
                left = mid;
            }
        }
        // 主程序先执行 findFirstPosition，能执行到 findLastPosition 说明数组中一定存在等于 target 的元素，因此这里不用判断 nums[left] 是否等于 target
        return left;
    }


}
