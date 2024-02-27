package 字符串;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/25 9:41
 * @注释 反转字符串 II
 */
public class _541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int start = 0; start < arr.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, arr.length - 1);
            while (i < j) {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        return new String(arr);
    }
}
