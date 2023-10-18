package vrtodp;

import java.util.HashSet;

public class _41 {
    public static void main(String[] args) {
        _41 sol = new _41();
        int[] nums = {1,2,3};
        System.out.println(sol.firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        for (int i=0; i<nums.length; i++) {
            if (!hashSet.contains(i+1)) {
                return i+1;
            }
        }
        return nums.length+1;
    }
}
