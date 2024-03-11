import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 9:20
 * @注释 无重叠区间
 */
public class _435 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(new _435().eraseOverlapIntervals(intervals));
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int length = intervals.length;
        int count = 1;
        int end = intervals[0][1];
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
        for (int i = 1; i < length; i++) {
            if (intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            }
        }
        return length - count;

    }
}
