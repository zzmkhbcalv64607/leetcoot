package 字符串;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/25 9:39
 * @注释 反转字符串
 */
public class _344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
