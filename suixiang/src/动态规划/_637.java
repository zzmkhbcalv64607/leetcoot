package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/8 9:53
 * @注释 最长递增子序列的个数
 */
public class _637 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int []dp = new int[n];
        //dp[i]表示以nums[i]结尾的最长递增子序列的长度
        //count[i]表示以nums[i]结尾的最长递增子序列的个数
        //递推公式：dp[i]=dp[j]+1  nums[i]>nums[j]
        int []count = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i]=1;
            count[i]=1;
        }
        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    if (dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }else if (dp[j]+1==dp[i]){
                        count[i]+=count[j];
                    }
                }
            }
            maxLen = Math.max(maxLen,dp[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i]==maxLen){
                res+=count[i];
            }
        }
        return res;
    }
}
