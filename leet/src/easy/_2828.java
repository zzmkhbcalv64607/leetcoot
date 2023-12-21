package easy;

import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/20 9:05
 * @注释 判别首字母缩略词
 */
public class _2828 {
    public static void main(String[] args) {
        System.out.println(new _2828().isAcronym(List.of("apple", "banana", "orange"), "abo"));
    }

    public boolean isAcronym(List<String> words, String s) {
        int length = s.length();
        if (length !=words.size()) return false;
        for (int i = 0; i < length; i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;

    }
}
