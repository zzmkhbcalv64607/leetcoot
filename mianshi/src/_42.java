/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/20 9:45
 * @注释 接雨水
 */
public class _42 {

    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        // 计算左边最高的
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
        }
        // 计算右边最高的
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
        }
        int water = 0;
        // 计算每个位置的水量
        for (int i = 0; i < n; i++) {
            int level = Math.min(left[i], right[i]);
            water += Math.max(0, level - height[i]);
        }
        return water;
    }
}
