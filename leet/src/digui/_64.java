package digui;

public class _64 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(nums));
    }
    public static int minPathSum(int[][] grid) {
//        int dp[][] = new int[grid.length][grid[0].length];
//        return f1(grid,0,0,dp);
        return f2(grid);
    }

    public static int f2(int[][] grid){
        int dp[][] = new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for (int i =1;i<grid.length;i++){
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }
        for (int i =1;i<grid[0].length;i++){
            dp[0][i]=grid[0][i]+dp[0][i-1];
        }

        for (int i =1;i<grid.length;i++){
            for (int j =1;j<grid[0].length;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
    public static int f1(int[][] grid,int i,int j,int[][] dp){
        if (dp[i][j]!=0){
            return dp[i][j];
        }
        if (i==grid.length-1&&j==grid[0].length-1){
            return grid[i][j];
        }
        if (i==grid.length-1){
            return grid[i][j]+f1(grid,i,j+1,dp);
        }
        if (j==grid[0].length-1){
            return grid[i][j]+f1(grid,i+1,j,dp);
        }
        dp[i][j]=grid[i][j]+Math.min(f1(grid,i+1,j,dp),f1(grid,i,j+1,dp));
        return dp[i][j];
    }

}
