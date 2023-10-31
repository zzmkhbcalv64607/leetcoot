package mid;

import java.util.Arrays;
import java.util.HashMap;

public class _75 {
    public static void main(String[] args) {
        _75 test = new _75();
        int[] nums = {2,0,2,1,1,0};
        test.sortColors(nums);
    }
    public void sortColors(int[] nums) {
        int[] w =new int[3];
        for (int i =0;i<nums.length;i++){
            w[nums[i]]++;
        }
        int index =0;
        for (int i =0;i<3;i++){
            for (int j =0;j<w[i];j++){
                nums[index++]=i;
            }
        }
    }
}
