package mid;


import java.util.Arrays;

/**
 * 执行 K 次操作后的最大分数
 */
public class _2530 {

    public static void main(String[] args) {
        _2530 sol = new _2530();
        int[] nums = {672579538,806947365,854095676,815137524};
        System.out.println(sol.maxKelements(nums, 3));
    }

    public long maxKelements(int[] nums, int k) {
        Arrays.sort(nums);
        long score = 0;
        int i= nums.length-1;
       while (k>0){
            score+=nums[i];
            if (nums[i]%3>0){
                nums[i]=nums[i]/3+1;
            }else {
                nums[i]=nums[i]/3;
            }

           Arrays.sort(nums);
            k--;
       }
       return score;
    }



}
