package digui;

public class _931 {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i]=matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                if (i1==0){
                    dp[i][i1]=Math.min(dp[i-1][i1],dp[i-1][i1+1])+matrix[i][i1];
                }else if (i1==matrix[0].length-1){
                    dp[i][i1]=Math.min(dp[i-1][i1],dp[i-1][i1-1])+matrix[i][i1];
                }else {
                    dp[i][i1]=Math.min(dp[i-1][i1],Math.min(dp[i-1][i1-1],dp[i-1][i1+1]))+matrix[i][i1];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            min=Math.min(min,dp[matrix.length-1][i]);
        }
        return min;
    }
}
