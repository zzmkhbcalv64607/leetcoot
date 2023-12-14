package 数组;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/12 9:37
 * @注释 螺旋矩阵 II
 */
public class _59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n) {

            int loop = 0;  // 控制循环次数
            int[][] res = new int[n][n];
            int start = 0;  // 每次循环的开始点(start, start)
            int count = 1;  // 定义填充数字
            int i, j;

            while (loop++ < n / 2) { // 判断边界后，loop从1开始
                // 模拟上侧从左到右
                for (j = start; j < n - loop; j++) {
                    res[start][j] = count++;
                }

                // 模拟右侧从上到下
                for (i = start; i < n - loop; i++) {
                    res[i][j] = count++;
                }

                // 模拟下侧从右到左
                for (; j >= loop; j--) {
                    res[i][j] = count++;
                }

                // 模拟左侧从下到上
                for (; i >= loop; i--) {
                    res[i][j] = count++;
                }
                start++;
            }

            if (n % 2 == 1) {
                res[start][start] = count;
            }

            return res;


    }
}
