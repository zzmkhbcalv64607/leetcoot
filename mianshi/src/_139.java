import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/24 9:30
 * @注释 单词拆分
 */
public class _139 {
    public static void main(String[] args) {
        System.out.println(new _139().wordBreak("leetcode", List.of("leet", "code")));
    }
    public boolean wordBreak(String s, List<String> wordDict) {
            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            //dp[i] 从0到i的子串是是否可以被拆分
            //公式 dp[i] = dp[j] && check(s[j..i−1])
            dp[0] = true;
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j <= i && !dp[i]; j++) {
                    if (dp[j] && wordDict.contains(s.substring(j, i + 1))) {
                        dp[i + 1] = true;
                        break;
                    }
                }
            }
            return dp[n];

        }

}
