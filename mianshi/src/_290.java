import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/27 9:34
 * @注释
 */
public class _290 {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> index = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }
}
