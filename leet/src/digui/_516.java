package digui;

public class _516 {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("aaa"));
    }

    public static int longestPalindromeSubseq(String s) {
        int right = s.length()-1;
        int left = 0;
        char[] charArray = s.toCharArray();
       // int i = f1(charArray, left, right);
        int dp[][]=new int[charArray.length][charArray.length];
       // int i = f1(charArray, left, right,dp);
        int i = f3(charArray);
        return i;

    }

    /**
     * 暴力递归
     * @param charArray
     * @param left
     * @param right
     * @return
     */
    public static int f1(char[] charArray,int left,int right,int[][] dp){
        if (left==right){
            return 1;
        }
        if (dp[left][right]!=0){
            return dp[left][right];
        }
      if (left>right){
          return 0;
      }
      int ans;
      if (charArray[left]==charArray[right]){
          ans = f1(charArray,left+1,right-1,dp)+2;
      }else {
          ans = Math.max(f1(charArray,left+1,right,dp),f1(charArray,left,right-1,dp));
      }
      dp[left][right]=ans;
      return dp[left][right];
    }

    /**
     * 记忆化搜索
     * @param charArray
     * @param left
     * @param right
     * @return
     */
    public static int f2(char[] charArray,int left,int right){
        if (left==right){
            return 1;
        }
        if (left>right||right<0){
            return 0;
        }
        int ans;
        if (charArray[left]==charArray[right]){
            ans = f2(charArray,left+1,right-1)+2;
        }else {
            ans = Math.max(f2(charArray,left+1,right),f2(charArray,left,right-1));
        }
        return ans;
    }

    public static int f3(char[] charArray){
        int n = charArray.length;
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i]=1;
        }
        for (int i = n-1; i >=0; i--) {
            if (i+1<n){
                dp[i][i+1]=charArray[i]==charArray[i+1]?2:1;
            }
            for (int j = i+2; j <n ; j++) {
                if (charArray[i]==charArray[j]){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return  dp[0][n-1];
    }
}
