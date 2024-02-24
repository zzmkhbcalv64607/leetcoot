/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/24 9:16
 * @注释 寻找重复数
 */
public class _287 {
    //龟兔赛跑算法
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        int pre1 = 0, pre2 = slow;
        while (pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }
}
