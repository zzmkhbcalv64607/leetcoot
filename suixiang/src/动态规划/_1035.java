package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/5 10:25
 * @注释 不相交的线
 */
public class _1035 {
    public static void main(String[] args) {
        _1035 test = new _1035();
        int[] nums1 = {1,4,2};
        int[] nums2 = {1,2,4};
        System.out.println(test.maxUncrossedLines(nums1, nums2));
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];
        //dp[i][j]表示nums1的前i个数和nums2的前j个数的最大连线数
        //递推公式 ：dp[i][j]=dp[i-1][j-1]+1
        for (int i = 0; i < n; i++) {
            int num1 =nums1[i];
            for (int j = 0; j <m; j++) {
                int num2 =nums2[j];
                if (num1==num2){
                    if (i>0&&j>0){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else {
                        dp[i][j]=1;
                    }
                }else {
                    if (i>0&&j>0){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }else if (i>0){
                        dp[i][j]=dp[i-1][j];
                    }else if (j>0){
                        dp[i][j]=dp[i][j-1];
                    }else {
                        dp[i][j]=0;
                    }
                }
                System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
}
