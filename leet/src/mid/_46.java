package mid;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。
 * 你可以 按任意顺序 返回答案。
 */
public class _46 {
    public static void main(String[] args) {
        _46 sol = new _46();
        int[] nums = {1,2,3};
        System.out.println(sol.permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        //用来收集 排列好的集合集合
        List<List<Integer>> list =new ArrayList<>();
        //用来排列
        List<Integer> arr =new ArrayList<>();
        int l= nums.length;

        dfs(nums,list,arr,l);
        return list;
    }

   void dfs(int[] nums, List<List<Integer>> list, List<Integer> arr, int l) {

            if (arr.size()==l){
                list.add(new ArrayList<>(arr));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (arr.contains(nums[i])){
                    continue;
                }
                arr.add(nums[i] );
                dfs(nums,list,arr,l);
                arr.remove(arr.size()-1);
            }



    }



}
