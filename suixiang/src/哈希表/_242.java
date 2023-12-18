package 哈希表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/15 9:17
 * @注释 有效的字母异位词
 */
public class _242 {
    public static void main(String[] args) {
        _242 test = new _242();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(test.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;     // 并不需要记住字符a的ASCII，只要求出一个相对数值就可以了
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }

        for (int count: record) {
            if (count != 0) {               // record数组如果有的元素不为零0，说明字符串s和t 一定是谁多了字符或者谁少了字符。
                return false;
            }
        }
        return true;                        // record数组所有元素都为零0，说明字符串s和t是字母异位词
    }
}
