import java.util.*;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/6 9:48
 * @注释 字母异位词分组
 */
public class _49 {
    //使用哈希表进行分类判断
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        _49 solution = new _49();
        List<List<String>> res = solution.groupAnagrams(strs);
        for (List<String> list : res) {
            System.out.println(list);
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            System.out.println(key);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
