import java.util.HashSet;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/8 9:28
 * @注释 找出美丽数组的最小和
 */
public class _2834 {
    public static void main(String[] args) {
        System.out.println(new _2834().minimumPossibleSum(2, 3));
    }
    public int minimumPossibleSum(int n, int target) {
        int res = 0; // 用于记录最小和
        HashSet<Integer> set = new HashSet<>(); // 用于记录是否重复
        int i = 1; // 从1开始累加

        while (set.size() < n) {
            // 检查i是否已经被加入到set中，如果没有，则加入并累加到结果中
            if (!set.contains(i)) {
                res += i;
                set.add(target-i); // 添加i到set中，标记为已处理
            }
            i++; // 移至下一个数
        }

        return res;
    }



}
