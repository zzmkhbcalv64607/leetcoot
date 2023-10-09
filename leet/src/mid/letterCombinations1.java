package mid;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations1 {

    String Map[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res;
    public static void main(String[] args) {
        letterCombinations1 l = new letterCombinations1();
        String s = "23";
        List<String> strings = l.letterCombinations(s);
        System.out.println(strings);
    }
    public List<String> letterCombinations(String digits) {

        res=new ArrayList<>();
        if(digits==null || digits.length()==0)
            return res;
    interDigits(digits,new StringBuilder(),0);

        return res;
    }

    private void interDigits(String digits, StringBuilder stringBuilder, int i) {
        if(i==digits.length()){
            res.add(stringBuilder.toString());
            return ;
        }
        char c = digits.charAt(i);
        System.out.println(c);
        String s = Map[c- '0'];
        for (int j=0;j<s.length();j++){
            stringBuilder.append(s.charAt(j));
            interDigits(digits,stringBuilder,i+1);
            StringBuilder stringBuilder1 = stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

    }
}

