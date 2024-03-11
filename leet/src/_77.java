import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/7 22:29
 * @注释 组合
 */
public class _77 {
    public List<List<Integer>> combine(int n, int k) {
        List <List<Integer> > res = new ArrayList< >();
        List <Integer> path = new ArrayList< >();
        dfs(n, k, 1, path, res);
        return res;

    }
    public void dfs(int n, int k, int start, List <Integer> path, List <List<Integer> > res) {
        if (path.size() == k) {
            res.add(new ArrayList < >(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            dfs(n, k, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
