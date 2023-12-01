package digui;

public class _63 {
    public static void main(String[] args) {
        int[][] nums = {{0,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(nums));

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
   //  return    f1(obstacleGrid,0,0);

        return    f2(obstacleGrid);
    }
    public static int f1(int[][] obstacleGrid,int i,int j){
        if (i>=obstacleGrid.length||j>=obstacleGrid[0].length){
            return 0;
        }
        if (obstacleGrid[i][j]==1){
            return 0;
        }
        if (i==obstacleGrid.length-1&&j==obstacleGrid[0].length-1){
            return 1;
        }

        if (obstacleGrid[i][j]==1){
            return 0;
        }
        if (i==obstacleGrid.length-1){
            return f1(obstacleGrid,i,j+1);
        }
        if (j==obstacleGrid[0].length-1){
            return f1(obstacleGrid,i+1,j);
        }

        return f1(obstacleGrid,i+1,j)+f1(obstacleGrid,i,j+1);
    }

    public static int f2(int[][] obstacleGrid){
        if (obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1){
            return 0;
        }
        int dp[][] =new int[obstacleGrid.length][obstacleGrid[0].length];


        for (int i =0;i<obstacleGrid.length;i++){
            if (obstacleGrid[i][0]==1){
                break;
            }
            dp[i][0]=1;
        }
        for (int i =0;i<obstacleGrid[0].length;i++){
            if (obstacleGrid[0][i]==1){
                break;
            }
            dp[0][i]=1;
        }
        for (int i =1;i<obstacleGrid.length;i++){
            for (int j =1;j<obstacleGrid[0].length;j++){
                if (obstacleGrid[i][j]==1){
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
