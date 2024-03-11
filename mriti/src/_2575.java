import java.math.BigInteger;
import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/7 9:35
 * @注释
 */
public class _2575 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(_2575.divisibilityArray("529282143571", 4)));
    }
    public static int[] divisibilityArray(String word, int m) {
        char[] s = word.toCharArray();
        int[] ans = new int[s.length];
        long x = 0;
        for (int i = 0; i < s.length; i++) {
            x = (x * 10 + (s[i] - '0')) % m;
            if (x == 0) {
                ans[i] = 1;
            }
        }
        return ans;

    }
}
