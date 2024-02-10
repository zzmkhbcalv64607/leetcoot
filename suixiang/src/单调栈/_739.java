package 单调栈;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/9 9:43
 * @注释 每日温度
 */
public class _739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int cur = temperatures[i];
            int j = i + 1;
            while (j < n && temperatures[j] <= cur) {
                j++;
            }
            if (j < n) {
                ans[i] = j - i;
            }
        }
        return ans;
    }
}
