/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/28 9:46
 * @注释 使二叉树所有路径值相等的最小代价
 */
public class _2673 {

    public int minIncrements(int n, int[] cost) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (cost[i] < cost[i - 1]) {
                res += cost[i - 1] - cost[i];
            }
        }
        return res;
    }
}
