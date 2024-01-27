package 动态规划.背包问题;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/27 11:38
 * @注释
 */
public class _back {

    public static void main(String[] args) {


        //递推公式 ：
        //Todo 不放第i个 材料  dp[i-1][j]
        //TODO 放第i个材料 dp[i-1][j-weights[i]]+values[i]
        //dp[M][N]=max(dp[M-1][N],dp[M-1][N-weights[M]]+values[M])

        Scanner sc = new Scanner(System.in);
        // M 代表物品的个数
        int M = sc.nextInt();
        // N 代表背包的容量
        int N = sc.nextInt();

        int[] weights = new int[M + 1];
        int[] values = new int[M + 1];
        for(int i = 1;i <= M; i++) {
            weights[i] = sc.nextInt();
        }
        for(int i = 1;i <= M; i++) {
            values[i] = sc.nextInt();
        }

        int[][] dp = new int[M+1][N+1];


        for(int i = weights[0];i <= N ;i ++) {
            dp[0][i] = values[0];
        }

        for(int i = 1;i <= M;i ++) {
            for(int j = 1;j <= N;j ++) {
                dp[i][j] = dp[i - 1][j];
                if(j >= weights[i]) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-weights[i]]+values[i]);
                }
            }
        }



        System.out.println(dp[M][N]);
    }

}
