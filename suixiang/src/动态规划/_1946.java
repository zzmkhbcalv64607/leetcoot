package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/13 10:25
 * @注释 找出到每个位置为止最长的有效障碍赛跑路线
 */
public class _1946 {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int[] dp = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (obstacles[i] >= obstacles[j]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            res[i] = dp[i];
        }
        return res;
    }
}
