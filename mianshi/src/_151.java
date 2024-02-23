/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/20 10:02
 * @注释 反转字符串中的单词
 */
public class _151 {
    public static void main(String[] args) {
        System.out.println(new _151().reverseWords("  hello world  "));
    }
    public String reverseWords(String s) {

        String[] strs = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("")) continue;
            res.append(strs[i] + " ");
        }
        return res.toString().trim();
    }
}
