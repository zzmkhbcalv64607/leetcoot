/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/21 9:51
 * @注释 和为 K 的子数组
 */
public class _560 {
    public static void main(String[] args) {
        System.out.println( new _560().subarraySum(new int[]{1,1,1},2) );
    }
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int res = 0;
        for (int i = 0; i <len; i++) {
            int sum =0  ;
            for (int j = i; j < len; j++) {
                sum+=nums[j];
                if (sum==k){
                    res ++ ;

                }
            }
        }

        return  res;
    }

}
