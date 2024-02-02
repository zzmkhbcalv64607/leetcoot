package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/2 10:05
 * @注释 买卖股票的最佳时机 II
 */
public class _122 {

    public int maxProfit(int[] prices) {
        int n =prices.length;
        int [][]dp =new int[n][2];
        //dp[i][0]表示第i天交易完后手里没有股票的最大利润 一直就没有 刚卖的
        //dp[i][1]表示第i天交易完后手里有股票的最大利润 一直就有 刚买的
        //dp[i][0]=max(dp[i-1][0],dp[i-1][1]+prices[i]) 卖出股票
        //dp[i][1]=max(dp[i-1][1],dp[i-1][0]-prices[i])  买入股票
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
