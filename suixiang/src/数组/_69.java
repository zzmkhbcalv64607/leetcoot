package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 10:59
 * @注释 x 的平方根
 */
public class _69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        int left = 0, right = x, res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long)mid * mid <= x) {
                res = mid;
                left = mid + 1;
            } else if ((long)mid * mid > x) {
                right = mid - 1;
            }
        }
        return res;
    }
}
