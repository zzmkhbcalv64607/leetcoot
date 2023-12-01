package mid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _89 {
    public static void main(String[] args) {
        _89 test = new _89();
        System.out.println(test.grayCode(2));
    }
    List<Integer> res = new ArrayList<>();
    public List<Integer> grayCode(int n) {
        dfs(n,new StringBuilder(),new int[]{0,1});
        return res;
    }
    public void dfs(int n, StringBuilder sb, int[] nums){
        //判断条件，是否返回
        if(sb.length() == n){
            // 二进制转换为十进制
            res.add(Integer.valueOf(sb.toString(),2));
            return;
        }
        //回溯第一个状态
        sb.append(nums[0]);
        //注意数组
        dfs(n,sb,new int[]{0,1});
        sb.deleteCharAt(sb.length()-1);
        // 回溯第二个状态
        sb.append(nums[1]);
        //注意数组
        dfs(n,sb,new int[]{1,0});
        sb.deleteCharAt(sb.length()-1);
    }}

//    public List<Integer> grayCode(int n) {
//        List<Integer> hashSet = new ArrayList<>();
//        List<Integer> list =new ArrayList<>();
//        dfs( hashSet,n,list);
//        return new ArrayList<>(hashSet);
//    }
//
//    private void dfs(List<Integer> hashSet, int n, List<Integer> list) {
//        int sum =0;
//
//        if(list.size()==n){
//            for (int i = list.size()-1,j=0; i >=0; i--,j++) {
//                sum+=list.get(i)*Math.pow(2,j);
//            }
//        hashSet.add(sum);
//return;
//        }
//
//
//        list.add(0);
//        dfs(hashSet,n,list);
//        list.remove(list.size()-1);
//        list.add(1);
//        dfs(hashSet,n,list);
//        list.remove(list.size()-1);
//
//
//
//
//    }
//}
