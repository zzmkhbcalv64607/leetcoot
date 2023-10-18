package mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 给你一个整数数组 nums，其中恰好有两个元素只出现一次，
 * 其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
 */
public class _260 {

    public static void main(String[] args) {
        _260 sol = new _260();
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(sol.singleNumber(nums)));
    }

    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        if (nums.length==2&&nums[0]!=nums[1]){
           return nums;
        }
        for (int num : nums) {
            if (hashSet.contains(num)){
                hashSet.remove(num);
            }else{
                hashSet.add(num);
            }
        }


        int [] w = new int[hashSet.size()];
        Iterator<Integer> iterator = hashSet.iterator();
        int i =0;
        while (iterator.hasNext()){
            w[i]=iterator.next();
            i++;
        }
        return w;
    }
}
