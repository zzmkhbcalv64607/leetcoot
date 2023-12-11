package digui;

public class _918 {
    public static void main(String[] args) {
        int [] s = {-3,-2,-3};
        System.out.println(maxSubarraySumCircular(s));
    }

    public static int maxSubarraySumCircular(int[] nums) {

        int max = 0;
        int sum = nums[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=sum){
                sum=sum+nums[i];
            }else {
                max = Math.max(max,sum);
                sum=0;
            }
            if (i==nums.length-1){
                if (nums[0]>nums[nums.length-1]){
                    sum=sum+nums[0];
                }
                max = Math.max(max,sum);
            }


        }

        return max;
    }
}
