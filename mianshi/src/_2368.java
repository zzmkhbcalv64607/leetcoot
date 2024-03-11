import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/2 9:20
 * @注释 受限条件下可到达节点的数目
 */
public class _2368 {
    int cnt = 0;

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean[] isrestricted = new boolean[n];
        for (int x : restricted) {
            isrestricted[x] = true;
        }

        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int[] v : edges) {
            g[v[0]].add(v[1]);
            g[v[1]].add(v[0]);
        }
        dfs(0, -1, isrestricted, g);
        return cnt;
    }

    public void dfs(int x, int f, boolean[] isrestricted, List<Integer>[] g) {
        cnt++;
        for (int y : g[x]) {
            if (y != f && !isrestricted[y]) {
                dfs(y, x, isrestricted, g);
            }
        }
    }


}
