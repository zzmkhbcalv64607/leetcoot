package tanxin;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/12 9:55
 * @注释
 */
public class _316 {
    public String removeDuplicateLetters(String s) {
        //贪心算法
        //每次都找到最小的字符，然后将其从字符串中删除
        //然后继续找下一个最小的字符
        //直到找不到最小的字符
        //然后将所有的字符拼接起来
        //返回
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        boolean[] inStack = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!inStack[c - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                    if (count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        inStack[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                inStack[c - 'a'] = true;
                sb.append(c);
            }
            count[c - 'a']--;
        }
        return sb.toString();
    }
}
