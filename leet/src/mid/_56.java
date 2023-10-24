package mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 */
public class _56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{1,5}};
        _56 v = new _56();
        System.out.println(Arrays.deepToString(v.merge(intervals)));

    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length==1){
            return intervals;
        }
      //  int[][] res = new int[1][2];
        List<int[]> res = new ArrayList<>();
        int index=0;
        for (int i = 0; i < intervals.length; i++) {
            res.add(new int[2]);
            res.get(index)[0]=intervals[i][0];
            res.get(index)[1]=intervals[i][1];
            for (int j = i; j < intervals.length; j++) {
             if (intervals[i][0]>=intervals[j][0]){
                    res.get(index)[0]=intervals[j][0];
                    res.get(index)[1]=intervals[i][1];
                    i++;
                }else     if (intervals[i][1]>=intervals[j][1]){
                 res.get(index)[0]=intervals[i][0];
                 res.get(index)[1]=intervals[i][1];
                 i++;
             }  else  if (intervals[i][1]>=intervals[j][0]){
                    res.get(index)[0]=intervals[i][0];
                    res.get(index)[1]=intervals[j][1];
                    i++;
                }
            }
            if (i<=intervals.length-1){
                index++;
            }


        }
        return res.toArray(new int[res.size()][]);
    }

}
