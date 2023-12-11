package digui;

public class _53 {
    public static void main(String[] args) {
        int [] s = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(s));
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i =0;i<nums.length;i++){
            if (sum>0){
                sum+=nums[i];
            }else {
                sum=nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
