package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/12 10:01
 * @注释 螺旋矩阵 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class _54 {

    public static void main(String[] args) {
        int[][] matrix = {{2,},{5}};
        System.out.println(spiralOrder(matrix));
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int loop = 0;  // 控制循环次数
        int circle = Math.min(n,m)/2; // 控制循环圈数
        int start = 0,q=1;  // 每次循环的开始点(start, start)
        if (Math.min(n,m)/2==1) {
            circle++;
        }
        int i, j;
        ArrayList<Integer> list = new ArrayList<>();
        while (loop<circle) { // 判断边界后，loop从1开始
            //终点为matrix[start][n-q]
            for (i = start; i <n-q ; i++) {
                list.add(matrix[start][i]);
            }
            //终点为matrix[m-q][n-q]
            for ( j = start; j < m - q; j++) {
                list.add(matrix[j][n-q]);
            }
            //终点为matrix[1][q-1]
           for (; i >=q ; i--) {
                    list.add(matrix[m-q][i]);
                }
            //终点为matrix[q-1][q-1]
            for (; j >=q ; j--) {
                list.add(matrix[j][q-1]);
            }
            loop++;
            q++;
            start++;
        }

        if (n % 2 == 1) {
            list.add(matrix[n/2][n/2]);
        }
        return list;
    }
}
