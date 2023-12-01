package mid;

import java.util.ArrayList;
import java.util.List;

public class _93 {
    public static void main(String[] args) {
        _93 test = new _93();
        String s = "25525511135";
        System.out.println(test.restoreIpAddresses(s));
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        int i =0;
        char[] charArray = s.toCharArray();
        StringBuilder aa =new StringBuilder();
       list =  dfs(charArray,i,list,aa);
       return list;
    }

    private List<String> dfs(char[] charArray, int i, List<String> list, StringBuilder aa) {
        if (i==charArray.length){
            String string = aa.toString();
             list.add(string);
             return list;
        }
        aa.append(charArray[i]);
        dfs(charArray,i+1,list,aa);
        aa.deleteCharAt(aa.length()-1);
        if (i+1<charArray.length){
            aa.append(charArray[i]);
            aa.append(charArray[i+1]);
            dfs(charArray,i+2,list,aa);
            aa.deleteCharAt(aa.length()-1);
            aa.deleteCharAt(aa.length()-1);
        }
        list.add(aa.toString());
        return list;
    }
}
