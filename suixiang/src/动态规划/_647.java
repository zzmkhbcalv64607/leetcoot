package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/8 9:24
 * @注释 回文子串
 */
public class _647 {
    public static void main(String[] args) {
        _647 test = new _647();
        System.out.println(test.countSubstrings("abc"));
    }
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        //dp[i][j]: s[i:j]是否是回文串
        //递推公式是： dp[i][j]=dp[i+1][j-1] && s[i]==s[j]
        //dp[][]初始化
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int res = n;
        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }
                if (dp[i][j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
