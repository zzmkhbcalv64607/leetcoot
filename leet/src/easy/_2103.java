package easy;

import java.util.HashMap;
import java.util.Map;

public class _2103 {
    public static void main(String[] args) {
        _2103 test = new _2103();
        System.out.println(test.countPoints("B0B6G0R6R0R6G9"));
    }

    public int countPoints(String rings) {
        int count=0;
        String substring1;
        //B0 B6 G0 R6 R0 R6 G9
        String[]strings=new String[rings.length()/2];
        for (int i = 0; i < rings.length();i+=2) {
            substring1 = rings.substring(i, i+2);
            strings[i/2]=substring1;
        }

        //B0 B6 G0 R6 R0 R6 G9
        for (int i = 0; i < 10; i++) {
            HashMap hashMap=new HashMap<>();
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(1)==(char)(48+ i)){
                    if (strings[j].charAt(0)=='R'){
                        hashMap.put('R',i);
                    }else if (strings[j].charAt(0)=='G'){
                        hashMap.put('G',i);
                    }else if (strings[j].charAt(0)=='B'){
                        hashMap.put('B',i);
                    }
                }
                if (hashMap.containsKey('R')&&hashMap.containsKey('G')&&hashMap.containsKey('B')){
                    count+=1;
                    break;
                }
            }
        }

        return count;


    }
}
