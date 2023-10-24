package mid;

public class _53 {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        _53 v = new _53();
        System.out.println(v.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
    int sum=0;
   sum = dfs(sum,nums,0,0);
    return sum;
    }

    private  int dfs(int sum, int[] nums, int i,int flag) {
        if (i>nums.length-1){
            return sum;
        }
//        if (flag+1!=i){
//            return sum;
//        }
        flag=i;
         int a= dfs(sum,nums,i+1,flag);
         int b = dfs(sum,nums,i+2,flag);
        return Math.max(a,b);
    }
}
