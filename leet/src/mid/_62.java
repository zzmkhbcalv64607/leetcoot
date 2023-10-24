package mid;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。
 * 机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 */
public class _62 {
    public static void main(String[] args) {
        _62 o = new _62();
        System.out.println(o.uniquePaths(3, 19));
    }


    public int uniquePaths(int m, int n) {
        int x=0,y=0;
        int[][] ws =new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                ws[i][i1]=-1;
            }
        }

        return dfs(x, y, m - 1, n - 1,ws);
    }

    private int dfs(int x, int y, int i, int z,int[][] ws) {
        if (x==i&&y==z){
            return 1;
        }
        if (x>i){
            return 0;
        }
        if (y>z){
            return 0;
        }
        if (ws[x][y]!=-1){
            return ws[x][y];
        }else {
            ws[x][y]=dfs(x+1,y,i,z,ws)+dfs(x,y+1,i,z,ws);
            return  ws[x][y];
        }

    }
}
