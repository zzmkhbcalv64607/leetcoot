package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/5 9:37
 * @注释 最长重复子数组
 */
public class _718 {
    public static void main(String[] args) {
        _718 test = new _718();
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        System.out.println(test.findLength(nums1, nums2));
    }
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];
        //dp[][]表示以nums1[i-1]和nums2[j-1]结尾的最长公共子数组的长度
        //dp[i][j]=dp[i-1][j-1]+1  nums1[i-1]==nums2[j-1]
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int num1 = nums1[i - 1];
            for (int j = 1; j <= m; j++) {
                int num2 = nums2[j - 1];
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    System.out.println("i = " + i + ", j = " + j + ", dp[i][j] = " + dp[i][j]);
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }
}
