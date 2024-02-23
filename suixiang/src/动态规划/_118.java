package 动态规划;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/11 9:42
 * @注释 杨辉三角
 */
public class _118 {
    public static void main(String[] args) {
        System.out.println(new _118().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        int [][] dp = new int[numRows][numRows];
        //dp[i][j]表示杨辉三角第i行第j列的值
        //递推公式：dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];

            }

        }
          List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(dp[i][j]);
            }
            res.add(list);
        }
        return res;


    }
}
