import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 19:50
 * @注释 划分字母区间
 */
public class _763 {
    public static void main(String[] args) {
        System.out.println(new _763().partitionLabels("ababcbacadefegdehijhklij"));
    }

    public List<Integer> partitionLabels(String s) {
        //先统计所有种类的字符的数量
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        for (int i : last) {
            System.out.print("   I  "+i);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            System.out.println(end);
            if (i == end) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;

    }
}
