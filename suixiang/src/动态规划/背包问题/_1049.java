package 动态规划.背包问题;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/29 9:33
 * @注释 最后一块石头的重量 II
 */
public class _1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) sum += stone;
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int stone : stones) {
            for (int j = target; j >= stone; j--) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }
        return sum - 2 * dp[target];
    }
}
