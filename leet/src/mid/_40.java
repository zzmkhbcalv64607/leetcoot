package mid;

import java.util.*;

public class _40 {
    public static void main(String[] args) {
        _40 test = new _40();
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> lists = test.combinationSum2(nums, target);
        System.out.println(lists);
    }
//    public List<List<Integer>> combinationSum2(int[] cs, int t) {
//        Arrays.sort(cs);
//        Set<List<Integer>> ans = new HashSet<>();
//        List<Integer> cur = new ArrayList<>();
//        dfs(cs, t, 0, ans, cur);
//        return new ArrayList<>(ans);
//    }
//
//    /**
//     * cs: 原数组，从该数组进行选数
//     * t: 还剩多少值需要凑成。起始值为 target ，代表还没选择任何数；当 t = 0，代表选择的数凑成了 target
//     * u: 当前决策到 cs[] 中的第几位
//     * ans: 最终结果集
//     * cur: 当前结果集
//     */
//    void dfs(int[] cs, int t, int u, Set<List<Integer>> ans, List<Integer> cur) {
//        if (t == 0) {
//            ans.add(new ArrayList<>(cur));
//            return;
//        }
//        if (u == cs.length || t < 0) return;
//
//        // 使用 cs[u]
//        cur.add(cs[u]);
//        dfs(cs, t - cs[u], u + 1, ans, cur);
//
//        // 进行回溯
//        cur.remove(cur.size() - 1);
//        // 不使用 cs[u]
//        dfs(cs, t, u + 1, ans, cur);
//    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>() {
        };
        List<Integer> list = new ArrayList<>();
        dfs(candidates,target,0,lists,list);
        return new ArrayList<>(lists);
    }

     void dfs(int[] candidates, int target, int i, List<List<Integer>> lists, List<Integer> list) {

        if (target==0){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int start =i;start<candidates.length;start++){
            if (start>i&&candidates[start]==candidates[start-1]){
                continue;
            }
            if (target-candidates[start]<0){
               break;
           }


            list.add(candidates[start]);
            dfs(candidates,target-candidates[start],start+1,lists,list);
            list.remove(list.size()-1);
        }


    }
}
