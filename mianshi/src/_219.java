import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/28 9:55
 * @注释 存在重复元素 II
 */
public class _219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // 在查找表中查询当前元素是否存在
            if (set.contains(nums[i])) {
                return true;
            }
            // 将当前元素加入查找表
            set.add(nums[i]);
            // 如果当前查找表的大小超过了 k，删除最早加入的那个元素
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
