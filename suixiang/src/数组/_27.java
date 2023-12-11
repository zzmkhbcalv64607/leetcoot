package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 10:18
 * @注释 移除元素
 */
public class _27 {
    public static void main(String[] args) {
        _27 test = new _27();
        System.out.println(test.removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(test.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));

     }

    public int removeElement(int[] nums, int val) {
        // 快慢指针
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

}
