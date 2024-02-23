import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/20 9:36
 * @注释 子集 II
 */
public class _90 {
    public static void main(String[] args) {
        System.out.println(new _90().subsetsWithDup(new int[]{1, 2, 2}));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            LinkedList<Integer> t = new LinkedList<>();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    if (i > 0 && (mask >> (i - 1) & 1) == 0 && nums[i] == nums[i - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[i]);
                }
            }
            if (flag) {
                res.add(t);
            }
        }
        return res;

    }
}
