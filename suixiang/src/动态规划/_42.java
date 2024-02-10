package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/10 9:49
 * @注释 接雨水
 */
public class _42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new _42().trap(height));
    }
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        //left[i]表示i左边的最大值
        int[] right = new int[n];
        //right[i]表示i右边的最大值
        //递推公式
        //left[i] = max(left[i-1],height[i])
        //right[i] = max(right[i+1],height[i])

        //初始化
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1],height[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(left[i],right[i]) - height[i];
        }
        return res;
    }
}
