package mid;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/19 9:26
 * @注释 寻找峰值 II
 */
public class _1901 {
    public static void main(String[] args) {
        int[][] mat = {{1, 4}, {3, 2}};
        System.out.println(Arrays.toString(new _1901().findPeakGrid(mat)));
    }
    public int[] findPeakGrid(int[][] mat) {
        int left = 0, right = mat.length - 2;
        while (left <= right) {
            int i = (left + right) >>> 1;
            int j = indexOfMax(mat[i]);
            if (mat[i][j] > mat[i + 1][j]) {
                right = i - 1; // 峰顶行号 <= i
            } else {
                left = i + 1; // 峰顶行号 > i
            }
        }
        return new int[]{left, indexOfMax(mat[left])};
    }

    private int indexOfMax(int[] a) {
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[idx]) {
                idx = i;
            }
        }
        return idx;
    }


}
