package 数组;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/11 11:07
 * @注释
 */
public class _367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long)mid * mid == num) {
                return true;
            } else if ((long)mid * mid < num) {
                left = mid + 1;
            } else if ((long)mid * mid > num) {
                right = mid - 1;
            }
        }
        return false;
    }
}
