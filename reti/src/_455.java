import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/10 19:06
 * @注释 分发饼干
 */
public class _455 {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2,3};
        System.out.println(new _455().findContentChildren(g, s));
    }
    public int findContentChildren(int[] g, int[] s) {
        //孩子的胃口
        Arrays.sort(g);
        //饼干的大小
        Arrays.sort(s);
        int child = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j]) {
               child++;
                i++;
            }
          j++;
        }
        return child;
    }
}
