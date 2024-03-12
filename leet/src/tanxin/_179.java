package tanxin;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/12 9:46
 * @注释 最大数
 */
public class _179 {
    public static void main(String[] args) {
        _179 a = new _179();
        int[] nums = {3,30,34,5,9};
        System.out.println(a.largestNumber(nums));
    }
    public String largestNumber(int[] nums) {
        // 使第一位数组最大的排在最前面
        int n = nums.length;
        String[] numsToWord = new String[n];
        for (int i = 0; i < n; i++) {
            numsToWord[i] = String.valueOf(nums[i]);
        }
        // 重写排序规则
        Arrays.sort(numsToWord, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });
        if (numsToWord[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : numsToWord) {
            sb.append(s);
        }
        return sb.toString();
    }
}
