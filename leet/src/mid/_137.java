package mid;

import java.util.HashMap;
import java.util.Hashtable;

public class _137 {

    public static void main(String[] args) {
        _137 test = new _137();
        int[] nums = {0,1,0,1,0,1,99};
        int result = test.singleNumber(nums);
        System.out.println(result);
    }
    public int singleNumber(int[] nums) {
//       // HashMap<Integer,Integer> map = new HashMap<>();
//        Hashtable<Integer,Integer> map = new Hashtable<>();
//        for (int num : nums) {
//            if (map.containsKey(num)){
//                map.put(num,map.get(num)+1);
//            }else {
//                map.put(num,1);
//            }
//        }
//
//        for (int num : nums) {
//            if (map.get(num)==1){
//                return num;
//            }
//        }
//        return -1;

        int a = 0, b = 0;
        for (int x : nums) {
            b = (b ^ x) & ~a;
            a = (a ^ x) & ~b;
        }
        return b;
    }
}
