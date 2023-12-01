package mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _187 {
    public static void main(String[] args) {
        _187 test = new _187();
        String s = "AAAAAAAAAAA";
        System.out.println(test.findRepeatedDnaSequences(s));
    }
    public List<String> findRepeatedDnaSequences(String s) {
        if (s == null || s.length() < 10) return new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int i =0;
        while (i+10<=s.length()) {
            String substring = s.substring(i, i+10);
            if (map.containsKey(substring)){
                map.put(substring, map.get(substring)+1);
                if (map.get(substring)==2)
                list.add(substring);
            }else {
                map.put(substring,1);
            }
            i++;
        }
        return list;
    }
}
