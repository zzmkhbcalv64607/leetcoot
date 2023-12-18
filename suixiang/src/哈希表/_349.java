package 哈希表;

import java.util.*;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/15 9:38
 * @注释 两个数组的交集
 */
public class _349 {
    public static void main(String[] args) {
        _349 test = new _349();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = test.intersection(nums1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }


        return resSet.stream().mapToInt(x -> x).toArray();



    }
}
