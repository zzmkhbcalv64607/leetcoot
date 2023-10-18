package mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _39 {

    public static void main(String[] args) {
        _39 test = new _39();
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = test.combinationSum(nums, target);
        System.out.println(lists);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates,target,0,lists,list);
        return lists;
    }

    private void dfs(int[] candidates, int target, int i, List<List<Integer>> lists, List<Integer> list) {
        if (target<0){
            return;
        }
        if (target==0){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int start = i;start<candidates.length;start++){
            list.add(candidates[start]);
            dfs(candidates,target-candidates[start],start,lists,list);
            list.remove(list.size()-1);
        }
    }

}
