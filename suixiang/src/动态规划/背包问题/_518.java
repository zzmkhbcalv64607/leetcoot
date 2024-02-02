package 动态规划.背包问题;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/31 9:19
 * @注释 零钱兑换 II
 */
public class _518 {
    public int change(int amount, int[] coins) {
        //递推表达式
        int[] dp = new int[amount + 1];
        //初始化dp数组，表示金额为0时只有一种情况，也就是什么都不装
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] =dp[j]+ dp[j - coin];
            }
        }
        return dp[amount];
    }
}
