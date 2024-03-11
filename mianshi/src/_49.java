import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/1 9:28
 * @注释 字母异位词分组
 */
public class _49 {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<>();
         if (strs.length == 0) {
              return res;
         }
            Map<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] ca = new char[26];
                for (char c : s.toCharArray()) {
                    ca[c - 'a']++;
                }
                String keyStr = String.valueOf(ca);
                if (!map.containsKey(keyStr)) {
                    map.put(keyStr, new ArrayList<>());
                }
                map.get(keyStr).add(s);
            }
            res.addAll(map.values());
            return res;

    }
}
