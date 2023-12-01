package mid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class _76 {
    public static void main(String[] args) {
        _76 test = new _76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(test.minWindow(s, t));
    }
    public String minWindow(String s, String t) {
        if (s.length()<t.length()){
            return "";
        }
        HashSet<Character> hashSet = new HashSet<>();
        HashMap<Integer,Character> hashtable = new HashMap<>();
        int ss=t.length()-1;
        while (ss>-1){
           hashSet.add(t.charAt(ss));
           ss--;
        }
        int i =0;
        while (i<s.length()){
            if (hashSet.contains(s.charAt(i)))
            {
                hashtable.put(i,s.charAt(i));
            }
                i++;
        }

        return t;
    }
}
