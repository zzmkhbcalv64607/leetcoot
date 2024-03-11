import java.util.HashSet;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/10 10:20
 * @注释
 */
public class _3 {
    public static void main(String[] args) {
        System.out.println(new _3().lengthOfLongestSubstring("abcabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int res = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < length && j < length) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                res = Math.max(res, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }
}
