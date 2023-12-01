package digui;

import java.util.Arrays;
import java.util.List;

public class _120 {
    public static void main(String[] args) {
        int i = minimumTotal(Arrays.asList(List.of(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3)));
        System.out.println(i);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()][triangle.size()];
        return f1(triangle, 0, 0,dp);

    }
    // i:第几行 j:第几个
    private static int f1(List<List<Integer>> triangle, int i, int j,int[][] dp) {

        if (i == triangle.size() ) {
            return 0;
        }
        if (dp[i][j]!=0){
            return dp[i][j];
        }

        dp[i][j]=Math.min(f1(triangle,i+1,j,dp),f1(triangle,i+1,j+1,dp))+triangle.get(i).get(j);
        return dp[i][j];
    }
    private int dfs(List<List<Integer>> triangle, int i, int j) {
        if (i == triangle.size()) {
            return 0;
        }
        return Math.min(dfs(triangle, i + 1, j), dfs(triangle, i + 1, j + 1)) + triangle.get(i).get(j);
    }


}
