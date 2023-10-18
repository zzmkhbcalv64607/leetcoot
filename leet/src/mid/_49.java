package mid;

import java.util.*;

public class _49 {
    public static void main(String[] args) {
        _49 sol = new _49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(sol.groupAnagrams(strs));
    }


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] charArr=str.toCharArray();
            Arrays.sort(charArr);
            String key=new String(charArr);

            List<String> list=map.getOrDefault(key,new ArrayList<String>());

            list.add(str);

            map.put(key,list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
