package mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和
public class threeSum {
    public static void main(String[] args) {
        threeSum t = new threeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = t.threeSum(nums);
        System.out.println(lists);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
       if (nums==null||nums.length<3){
           return list;
       }

        //判断数组》3的情况
        Arrays.sort(nums);

        for (int i=0;i< nums.length-2;i++){
            if (i>0 && nums[i]==nums[i-1] )
                continue;

            int left= i +1;
            int right= nums.length-1;
            while(left<right){
                int f= nums[i]+ nums[left]+ nums[right];
                if (f==0){

                        list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while (left<right&&nums[left]==nums[left+1])left++;
                    while (left<right&&nums[right]==nums[right-1])right--;
                    left++;
                    right--;

                }else if(f<0) {
                    left++;}else {
                    right--;
                }
            }

        }

        return list;
    }


}
