package 动态规划.背包问题;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/31 9:57
 * @注释 零钱兑换
 */
public class _322 {
    public int coinChange(int[] coins, int amount) {
        int [][]dp = new int[coins.length+1][amount+1];
        //dp[coins.length+1][amount+1]的含义是：使用前i个硬币，凑成总金额为j的最少硬币数
        //dp[i-1][j] 表示不使用第i个硬币，凑成总金额为j的最少硬币数
        //dp[i][j-coins[i-1]] 表示使用第i个硬币，凑成总金额为j的最少硬币数

        //初始化dp数组
        dp[0][0] = 0;
        for(int i = 1; i <= amount; i++) {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i <= coins.length; i++) {
            dp[i][0] = 0;
        }

        for(int i = 1; i <= coins.length; i++) {
            for(int j = 1; j <= amount; j++) {
                //如果不使用第i个硬币，那么凑成总金额为j的最少硬币数就是dp[i-1][j]
                dp[i][j] = dp[i-1][j];
                //如果使用第i个硬币，那么凑成总金额为j的最少硬币数就是dp[i][j-coins[i-1]]+1
                if(j >= coins[i-1] && dp[i][j-coins[i-1]] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-coins[i-1]]+1);
                }
            }
        }
        return dp[coins.length][amount] == Integer.MAX_VALUE ? -1 : dp[coins.length][amount];
    }
}
