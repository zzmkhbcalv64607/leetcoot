import java.util.HashMap;
import java.util.HashSet;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/10 9:20
 * @注释 猜数字游戏
 */
public class _299 {
    public static void main(String[] args) {
        System.out.println(new _299().getHint("1807", "7810"));
    }
    public String getHint(String secret, String guess) {
        int a = 0, b = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if (c1 == c2) {
                a++;
            } else {
                map.put(c1, map.getOrDefault(c1, 0) + 1);
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if (c1 != c2 && map.getOrDefault(c2, 0) > 0) {
                b++;
                map.put(c2, map.get(c2) - 1);
            }
        }
        return a + "A" + b + "B";

    }
}
