/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/15 11:16
 * @注释 除自身以外数组的乘积
 */
public class _238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        _238 instance = new _238();
        int[] res = instance.productExceptSelf(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            res[i] = left;
            left *= nums[i];

        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];

        }
        return res;

    }
}
