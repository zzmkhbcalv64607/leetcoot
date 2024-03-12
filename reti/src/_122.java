/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 20:13
 * @注释
 */
public class _122 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new _122().maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
      // 动态规划 今天的最大利润 = max(昨天的最大利润, 今天的价格 - 昨天的价格 + 昨天的最大利润)
        int length = prices.length;
        int dp0 = 0;
        int dp1 = -prices[0];
        for (int i = 1; i < length; i++) {
            int newDp0 = Math.max(dp0, dp1 + prices[i]);
            int newDp1 = Math.max(dp1, dp0 - prices[i]);
            dp0 = newDp0;
            dp1 = newDp1;
        }
        return dp0;
    }
}
