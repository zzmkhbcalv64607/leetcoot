package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/4 9:22
 * @注释 买卖股票的最佳时机含冷冻期
 */
public class _309 {
    public static void main(String[] args) {
        _309 test = new _309();
        int[] prices = {1,2,3,0,2};
        System.out.println(test.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][]dp =new int[n][3];
        //dp[i][0]表示第i天交易完后手里没有股票的最大利润 一直就没有 刚卖的
        //dp[i][1]表示第i天交易完后手里有股票的最大利润 一直就有 刚买的
        //dp[i][2]表示第i天交易完后手里没有股票且处于冷冻期的最大利润
        //dp[i][0]=max(dp[i-1][0],dp[i-1][1]+prices[i]) 卖出股票
        //dp[i][1]=max(dp[i-1][1],dp[i-1][2]-prices[i])  买入股票
        //dp[i][2]=dp[i-1][0]  冷冻期
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        dp[0][2]=0;
        for (int i = 1; i < n; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][2]-prices[i]);
            dp[i][2]=dp[i-1][0];
        }
        return dp[n-1][0];
    }
}
