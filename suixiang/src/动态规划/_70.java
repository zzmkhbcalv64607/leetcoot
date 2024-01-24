package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/23 11:37
 * @注释  爬楼梯
 */
public class _70 {
    public static void main(String[] args) {
        System.out.println(new _70().climbStairs(3));
    }
    public int climbStairs(int n) {
        // 第一步 确定含义
        int[] dp =new int[n];
        // 第二部递推公式 dp[i]=dp[i-1]+dp[i-2]
        // 第三部 初始化
        for (int i = 0; i < n; i++) {
            if (i == 0) dp[i] = 1;
            else if (i == 1) dp[i] = 2;
            else dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
