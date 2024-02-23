import java.util.LinkedList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/21 9:47
 * @注释 找到字符串中所有字母异位词
 */
public class _438 {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        int[] cnt = new int[26];
        for (int i = 0; i < m; i++) {
            cnt[p.charAt(i) - 'a']++;
        }
        int left = 0, right = 0;
        int[] tmp = new int[26];
        List<Integer> res = new LinkedList<>();
        while (right < n) {
            tmp[s.charAt(right) - 'a']++;
            while (tmp[s.charAt(right) - 'a'] > cnt[s.charAt(right) - 'a']) {
                tmp[s.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == m) {
                res.add(left);
            }
            right++;
        }
        return res;
    }
}
