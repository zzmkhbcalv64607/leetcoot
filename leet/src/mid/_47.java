package mid;

import java.util.*;

public class _47 {
    public static void main(String[] args) {
        _47 sol = new _47();
        int[] nums = {1,1,2};
        System.out.println(sol.permuteUnique(nums));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        //用来排列
        //List<Integer> arr =new ArrayList<>();
        Deque<Integer>arr= new ArrayDeque<>();
        int l= nums.length;
        Deque<Integer>objects= new ArrayDeque<>();
       // ArrayList<Integer> objects = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,list,arr,l,objects);
        return list;
    }

    private void dfs(int[] nums, List<List<Integer>> list,Deque<Integer> arr , int l,Deque<Integer> objects) {
        if (arr.size()==l){
            if (list.contains(new ArrayList<>(arr))){
                return;
            }
            list.add(new ArrayList<>(arr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (objects.contains(i)){
                continue;
            }
            objects.add(i);
            arr.add(nums[i] );


            dfs(nums,list,arr,l,objects);
            arr.removeLast();
            objects.removeLast();
        }

    }
}
