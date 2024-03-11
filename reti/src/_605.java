/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 9:44
 * @注释 种花问题
 */
public class _605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                //判断边界
                int next = (i == length - 1) ? 0 : flowerbed[i + 1];
                //判断边界
                int pre = (i == 0) ? 0 : flowerbed[i - 1];
                if (next == 0 && pre == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;

    }
}
