package mid;

import java.util.ArrayList;
import java.util.List;

public class _78 {
    public static void main(String[] args) {
        _78 test = new _78();
        System.out.println(test.subsets(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sum =new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        dfs(nums,0,list,sum);
        return sum;
    }

    private void dfs(int[] nums, int i, List<Integer> list, List<List<Integer>> sum ) {
//        if (sum.contains(list)){
//            return;
//        }
        if (i>=nums.length){
            sum.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        dfs(nums,i+1,list,sum);
        list.remove(list.size()-1);
        dfs(nums,i+1,list,sum);
    }
}
