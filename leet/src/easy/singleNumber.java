package easy;

import java.util.Arrays;
import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {
        singleNumber test = new singleNumber();
        int[] nums = {4,1,2,1,2};
        int result = test.singleNumber1(nums);
        System.out.println(result);
    }
    public int singleNumber1(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0 ;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for (int i =0 ;i<nums.length;i++){
            if (map.get(nums[i])==1){
                return nums[i];
            }
        }


       return -1;
    }
}
