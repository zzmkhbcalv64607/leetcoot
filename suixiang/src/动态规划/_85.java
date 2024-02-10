package 动态规划;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/10 9:57
 * @注释 最大矩形
 */
public class _85 {
    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(new _85().maximalRectangle(matrix));
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] left = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    left[i][j] = (j == 0 ? 0 : left[i][j-1]) + 1;
                }
            }
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            int[] up = new int[m];
            int[] down = new int[m];
            java.util.Arrays.fill(down, m);
            java.util.Deque<Integer> stack = new java.util.LinkedList<>();
            for (int i = 0; i < m; i++) {
                while (!stack.isEmpty() && left[stack.peek()][j] >= left[i][j]) {
                    down[stack.pop()] = i;
                }
                up[i] = stack.isEmpty() ? -1 : stack.peek();
                stack.push(i);
            }
            for (int i = 0; i < m; i++) {
                res = Math.max(res, (down[i] - up[i] - 1) * left[i][j]);
            }
        }
        return res;

    }
}
