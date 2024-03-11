
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/28 14:59
 * @注释小球投盒

 */
public class m1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            //小球投盒
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] <= m) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }




}
