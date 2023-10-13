package easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s = ")([]{}";
        System.out.println(v.isValid(s));
    }

    public boolean isValid(String s) {

        //1.特判
        if(s.isEmpty()) return true;
        //2.创建辅助栈
        Stack<Character> stack = new Stack<>();
        //3.遍历
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        //4.返回
        return stack.isEmpty();

    }
}
