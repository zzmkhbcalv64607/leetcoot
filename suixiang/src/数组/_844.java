package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 16:40
 * @注释 比较含退格的字符串
 */
public class _844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public static String build(String s){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (c!='#'){
                sb.append(c);
            }else {
                if (sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}
