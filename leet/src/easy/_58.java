package easy;

public class _58 {

    public static void main(String[] args) {
        _58 o = new _58();
        System.out.println(o.lengthOfLastWord("Hello World asdasdasdasads"));
    }
    public int lengthOfLastWord(String s) {
    int len = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') len++;
            else if (len > 0) return len;
        }
        return len;
    }
}
