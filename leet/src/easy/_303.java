package easy;

public class _303 {
   public int[] sum;

    public void NumArray(int[] nums) {
        sum=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1]=sum[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sum[right+1]-sum[left];
    }
}
