package mid;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 */
public class _63 {
    public static void main(String[] args) {
        _63 o = new _63();
        System.out.println(o.uniquePathsWithObstacles(new int[][]{{0,0}}));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int x=0,y=0;
        if (m>0&&n>0){
            if (obstacleGrid[m-1][n-1]==1){
                return 0;
            }
        }

        if (obstacleGrid[0][0]==1){
            return 0;
        }
        if (m==1&&n==1){
            return 1;
        }
        int[][] ws =new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                ws[i][i1]=-1;
            }
        }

        return dfs(x, y, m - 1, n - 1,ws,obstacleGrid);
    }

    private int dfs(int x, int y, int i, int i1, int[][] ws, int[][] obstacleGrid) {
        if (x>i){
            return 0;
        }
        if (y>i1){
            return 0;
        }
        if (x==i&&y==i1){
            return 1;
        }
        if (obstacleGrid[x][y]==1){
            return 0;
        }

        if (ws[x][y]!=-1){
            return ws[x][y];
        }else {
            ws[x][y]=dfs(x+1,y,i,i1,ws,obstacleGrid)+dfs(x,y+1,i,i1,ws,obstacleGrid);
            return  ws[x][y];
        }
    }
}
