import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/6 9:51
 * @注释 最长连续序列
 */
public class _128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                cnt++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                res = Math.max(res, cnt);
                cnt = 1;
            }
        }
        res = Math.max(res, cnt);
        return res;
    }
}
