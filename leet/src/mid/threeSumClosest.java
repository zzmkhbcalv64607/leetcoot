package mid;

import java.util.Arrays;

//最接近的三数之和
public class threeSumClosest {
    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;

        System.out.println(threeSumClosest1(nums,target));
    }
    public static int threeSumClosest1(int[] nums, int target) {
            if (nums.length==3){
                return nums[0]+nums[1]+nums[2];
            }
            int flag=Integer.MAX_VALUE;
            int j=0;

        Arrays.sort(nums);

        for (int i=0;i< nums.length-2;i++){
            if (i>0 && nums[i]==nums[i-1] )
                continue;

            int left= i +1;
            int right= nums.length-1;
            while(left<right){
                int f= nums[i]+ nums[left]+ nums[right];
                int q = f - target;
                if (q<flag){
                    flag=Math.abs(f-target);
                    j=f;
                    if (q==target){
                        return j;
                    }
                }
                while (left<right&&nums[left]==nums[left+1])left++;
                while (left<right&&nums[right]==nums[right-1])right--;
                if(f> target)
                    right--;
                else if(f < target)
                    left++;
                else
                    return j;



            }
        //    System.out.println(nums[i]);

        }

        return j;
    }
}
