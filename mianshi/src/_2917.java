/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/6 9:31
 * @注释 找出数组中的 K-or 值
 */
public class _2917 {
    public int findKOr(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if (((num >> i) & 1) == 1) {
                    cnt[i]++;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (cnt[i] % k != 0) {
                res += (1 << i);
            }
        }
        return res;

    }
}
