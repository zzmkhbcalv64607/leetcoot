/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/27 9:30
 * @注释
 */
public class _205 {
    public static void main(String[] args) {
        System.out.println(new _205().isIsomorphic("egg", "add"));
    }
    public boolean isIsomorphic(String s, String t) {
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        //初始化为0
        for (int i = 0; i < s.length(); i++) {
            //这里加1是为了防止0和空串的冲突
            char sc = s.charAt(i);
            //这里加1是为了防止0和空串的冲突
            char tc = t.charAt(i);
            if (preIndexOfS[sc] != preIndexOfT[tc]) {
                return false;
            }
            preIndexOfS[sc] = i + 1;
            preIndexOfT[tc] = i + 1;
        }
        return true;
    }
}
