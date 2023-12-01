package easy;

import java.util.Arrays;
import java.util.List;

public class _2842 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        System.out.println(countPairs(nums, 2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int sum =0;
        for (int i = 0; i < nums.size(); i++) {
            for (int i1 = i+1; i1 < nums.size(); i1++) {
                if (i != i1 && nums.get(i) + nums.get(i1) < target) {
                    sum++;
                }
            }
        }
return  sum ;
    }
}
