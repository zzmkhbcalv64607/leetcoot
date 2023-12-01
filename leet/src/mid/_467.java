package mid;

public class _467 {
    public static void main(String[] args) {
        int ss = new _467().findSubstringInWraproundString("zab");
        System.out.println(ss);
    }
    public int findSubstringInWraproundString(String s) {
        int[] dp = new int[26];

        int []str = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i)-'a';
        }
        dp[str[0]]=1;
     for(int i =1,cur,pre,count=1;i<=s.length()-1;i++){
         cur =str[i];
         pre = str[i-1];
         if (pre+1==cur||(pre==25&&cur==0)){

             count++;
         }else {
                count=1;
         }
            dp[cur] = Math.max(dp[cur],count);
     }
        int sum = 0;
        for (int i : dp) {
            sum += i;
        }
        return sum;

    }
}
