package mid;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 递归
 */
public class Parentheses {


    public static void main(String[] args) {
        Parentheses p = new Parentheses();
        List<String> strings = p.generateParenthesis(3);
        System.out.println(strings);
    }
    public List<String> generateParenthesis(int n) {
        List<String>   list =new ArrayList<String>();


        List<String> def = def(list, "", 0, 0, n);
        return def;
    }

    /**
     *
     * @param list 结果集
     * @param s 临时字符串
     * @param i 左括号个数
     * @param i1 右括号个数
     * @param n 括号对数
     */
    private List<String> def(List<String> list, String s, int i, int i1, int n) {
        if (i>n||i1>n||i1>i){
            return list;
        }
        if (i==n&&i1==n){
            list.add(s);
            return list;
        }
        def(list,s+"(",i+1,i1,n);
        def(list,s+")",i,i1+1,n);
        return list;
    }
}
