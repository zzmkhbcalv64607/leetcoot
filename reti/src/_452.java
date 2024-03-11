import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 9:57
 * @注释 用最少数量的箭引爆气球
 */
public class _452 {
    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(new _452().findMinArrowShots(points));
    }
    public int findMinArrowShots(int[][] points) {
        //有公共区间的一支箭就可以 然后jia1
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int length = points.length;
        int count = 1;
     long end = points[0][1];
        for (int i = 1; i < length; i++) {
            if (points[i][0] > end) {
                count++;
                end = points[i][1];
            }
        }
        return count;
    }
}
