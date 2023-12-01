package mid;

import java.util.ArrayList;
import java.util.List;

public class _77 {

    public static void main(String[] args) {
        _77 test = new _77();
        System.out.println(test.combine(4, 2));
    }
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {

        List<Integer> aa=new ArrayList<>();
        if (n==1){
            aa.add(1);
            list.add(aa);
            return list;
        }

       dfs(n,k,aa,1);
        return list;
    }

    private void dfs(int n, int k, List<Integer> aa,int i) {
        if (aa.size()==k){
            list.add(new ArrayList<>(aa));
            return;
        }
        if (i>n){

            return;
        }
        aa.add(i);
        dfs(n,k,aa,i+1);
        aa.remove(aa.size()-1);
        dfs(n,k,aa,i+1);
    }
}
