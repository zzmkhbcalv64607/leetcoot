package 哈希表;

import java.util.HashMap;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/18 9:57
 * @注释 两数之和
 */
public class _1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
