package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/23 12:01
 * @注释 使用最小花费爬楼梯
 */
public class _746 {

    public int minCostClimbingStairs(int[] cost) {
        int []dp =new int[cost.length+1];
        dp[0]=0;
        dp[1]=0;
        for (int i =2; i <=cost.length ; i++) {
            //递推公式
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
}
