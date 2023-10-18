package mid;

public class _43 {
    public static void main(String[] args) {
        _43 sol = new _43();
        String num1 = "123";
        String num2 = "456";
        System.out.println(sol.multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        int[] res = new int[num1.length()+num2.length()];
        for (int i=num1.length()-1; i>=0; i--) {
            for (int j=num2.length()-1; j>=0; j--) {
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1 = i+j, p2 = i+j+1;
                int sum = mul+res[p2];
                res[p1] += sum/10;
                res[p2] = sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<res.length; i++) {
            if (sb.length()==0&&res[i]==0) {
                continue;
            }
            sb.append(res[i]);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
