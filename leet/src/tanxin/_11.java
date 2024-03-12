package tanxin;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/12 9:42
 * @注释 盛最多水的容器
 */
public class _11 {
    public static void main(String[] args) {
        _11 a = new _11();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(a.maxArea(height));
    }
    public int maxArea(int[] height) {
        //贪心算法 每个子问题最优的时候，整个问题的最优解也是最优的
        //双指针
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
