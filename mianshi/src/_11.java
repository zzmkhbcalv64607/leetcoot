/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/16 9:48
 * @注释 盛最多水的容器
 */
public class _11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int res = 0;
        while (left < right) {
            res = Math.max(res, (right-left)*Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
