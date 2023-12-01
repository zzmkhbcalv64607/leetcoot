package easy;

import java.util.LinkedList;
import java.util.Queue;

public class _2609  {
    public static void main(String[] args) {
        _2609 test = new _2609();
        String s = "001011";
        System.out.println(test.findTheLongestBalancedSubstring(s));
    }
    //队列
    public int findTheLongestBalancedSubstring(String s) {
        if (s.length()==1){
            return 0;
        }
        char[] charArray = s.toCharArray();
        int sum = 0,flag = 0;

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {

            if (charArray[i]== '0'){
                queue.offer(charArray[i]);
            }
            if (charArray[i]=='1'&&queue.size()>0){
                queue.poll();
                sum++;
            }else {

                sum=0;
            }
            if (sum>flag)
                flag = sum;



        }

            return flag*2;
    }
}
