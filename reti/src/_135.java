import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/10 21:17
 * @注释 分发糖果
 */
public class _135 {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(new _135().candy(ratings));
    }
    public int candy(int[] ratings) {
      //初始 所有人都有一个糖果 从左往右 如果右边的评分比左边的高 那么右边的糖果数等于左边的糖果数+1
        //从右往左 如果左边的评分比右边的高 且左边的糖果数小于等于右边的糖果数 那么左边的糖果数等于右边的糖果数+1
        int length = ratings.length;
        int[] candy = new int[length];
        int sum = 0;
        Arrays.fill(candy, 1);
           for (int i = 1; i < length; i++) {
                if (ratings[i] > ratings[i - 1]) {
                    candy[i] = candy[i - 1] + 1;
                }
            }
            for (int i = length - 2; i >= 0; i--) {
                if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
                    candy[i] = candy[i + 1] + 1;
                }
            }
            for (int i = 0; i < length; i++) {
                sum += candy[i];
            }
            return sum;
    }
}
