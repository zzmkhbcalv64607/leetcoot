package vrtodp;

import java.util.Arrays;

public class TEST1 {
    public static void main(String[] args) {
        TEST1 test = new TEST1();
        System.out.println(test.numDecodings("111"));
    }

//    public int numDecodings(String s) {
//        int[] w =new int[s.length()];
//        Arrays.fill(w,-1);
//        char[] charArray = s.toCharArray();
//    return     dfs(charArray,0,w);
//    }
//
//    public int dfs(char[] chars,int i,int []w){
//        if (i==chars.length){
//            return 1;
//        }
//        if (w[i]!=-1){
//            return w[i];
//        }
//        int ans =0;
//        if (chars[i]-'0'==0){
//           ans =0;
//        }else {
//            ans=dfs(chars,i+1,w);
//
//            if (i+1<chars.length&&((chars[i]-'0')*10+(chars[i+1]-'0')<=26)){
//                ans +=dfs(chars,i+2,w);
//            }
//        }
//        w[i]=ans;
//return ans;
//    }


    public int numDecodings(String s) {
        int[] w =new int[s.length()];
        char[] charArray = s.toCharArray();
        w[1]=1;
        w[2]=2;
        for (int i=3;i<s.length();i++){
            w[i]=w[i-1]+w[i-2];
        }

        return     w[0];
    }
}
