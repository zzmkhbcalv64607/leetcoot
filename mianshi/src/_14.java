/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/23 9:32
 * @注释 最长公共前缀
 */
public class _14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //strs[i].indexOf(prefix) != 0 说明prefix不是strs[i]的前缀
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
