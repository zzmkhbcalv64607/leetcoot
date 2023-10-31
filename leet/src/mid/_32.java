package mid;

public class _32 {
    public static void main(String[] args) {
        _32 test = new _32();
        System.out.println(test.longestValidParentheses(")()())"));
    }
    public int longestValidParentheses(String s) {
        char[] charArray = s.toCharArray();
        int []w =new int[charArray.length];
        int ans =0;
       for (int i =1,p;i<charArray.length;i++){
           if (charArray[i]==')'){
               p=i-w[i-1]-1;
               if (p>=0&&charArray[p]=='('){
                   w[i]=w[i-1]+2+(p>0?w[p-1]:0);
               }
           }

ans=Math.max(ans,w[i]);
       }
       return ans;
    }


}
