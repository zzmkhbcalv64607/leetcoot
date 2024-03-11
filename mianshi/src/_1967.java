import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/5 9:32
 * @注释 到达目的地的方案数
 */
public class _1967 {
    public static void main(String[] args) {
        System.out.println(new _1967().countPaths(7, new int[][]{{0, 6, 7}, {0, 3, 7}, {3, 6, 100}, {3, 2, 10}, {2, 6, 10}, {1, 3, 1}, {1, 6, 1}, {6, 4, 1}, {4, 5, 1}, {5, 6, 1}}));
    }
    public int countPaths(int n, int[][] roads) {
        int mod = (int) 1e9 + 7;
        long[] dis = new long[n];
        long[] ways = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        dis[0] = 0;
        ways[0] = 1;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!vis[j] && (u == -1 || dis[j] < dis[u])) {
                    u = j;
                }
            }
            vis[u] = true;
            for (int[] road : roads) {
                int a = road[0], b = road[1], w = road[2];
                if (u == a) {
                    if (dis[b] > dis[a] + w) {
                        dis[b] = dis[a] + w;
                        ways[b] = ways[a];
                    } else if (dis[b] == dis[a] + w) {
                        ways[b] = (ways[b] + ways[a]) % mod;
                    }
                }
                if (u == b) {
                    if (dis[a] > dis[b] + w) {
                        dis[a] = dis[b] + w;
                        ways[a] = ways[b];
                    } else if (dis[a] == dis[b] + w) {
                        ways[a] = (ways[a] + ways[b]) % mod;
                    }
                }
            }
        }
        return (int) ways[n - 1];

    }
}
