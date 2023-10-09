package mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
 * 请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c],
 * nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 */
public class Sum4 {
;
    List<List<Integer>> list ;
    public static void main(String[] args) {
        Sum4 s = new Sum4();
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(1000000000+1000000000+1000000000+1000000000);

        int target = -294967296;
        List<List<Integer>> lists = s.fourSum(nums, target);
        System.out.println(lists);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long target1 =(long)target;

        list = new ArrayList<>();
        if (nums.length<4){
            return list;
        }
        Arrays.sort(nums);



        int i=0,j= i+1;
        int left=0,right=0;
        while (i<nums.length-3){


        while
            (j<nums.length-2){
            left=j+1;
            right= nums.length-1;
            while (left<right){
                long f=nums[i]+nums[j]+nums[left]+nums[right];
                System.out.println(f);
                if (f> target1){
                    break;}
                if (f== target1){

                    list.add(Arrays.asList(nums[i],nums[left],nums[right],nums[j]));

                    while (left<right&&nums[left]==nums[left+1])left++;
                    while (left<right&&nums[right]==nums[right-1])right--;
                    left++;
                    right--;
                }else if (f<target){

                    left++;
                    while (left<right&&nums[left]==nums[left-1])left++;
                }else {
                    right--;
                    while (left<right&&nums[right]==nums[right+1])right--;
                }
            }

            j++;
            while (j<nums.length-2&&nums[j]==nums[j-1])j++;
        }
            i++;
            while (i<nums.length-3&&nums[i]==nums[i-1])i++;
            j=i+1;
        }



        return list;
    }
}

// int f=nums[i]+nums[j]+nums[left]+nums[right];
//                    if (f==target){
//                        ss.add(nums[i]);
//                        ss.add(nums[j]);
//                        ss.add(nums[left]);
//                        ss.add(nums[right]);
//                        list.add(ss);
//                    }else if (f<target){
//
//                        left++;
//                        while (left<right&&nums[left]==nums[left+1])left++;
//                    }else {
//                        right--;
//                        while (left<right&&nums[right]==nums[right-1])right--;
//                    }