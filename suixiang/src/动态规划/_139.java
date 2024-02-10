package 动态规划;

import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/8 9:49
 * @注释 单词拆分
 */
public class _139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        //dp[i]表示s的前i个字符是否可以拆分成wordDict中的单词
        //递推公式：dp[i]=dp[i] || dp[i-len]  len是wordDict中的单词长度
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                int len = word.length();
                if (len <= i && word.equals(s.substring(i - len, i))) {
                    dp[i] = dp[i] || dp[i - len];
                }
            }
        }
        return dp[n];
    }
}
