/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 9:06
 * @注释
 */
public class _2129 {
    public static void main(String[] args) {
        System.out.println(new _2129().capitalizeTitle("capiTalIze tHe titLe"));
    }
    public String capitalizeTitle(String title) {
        //利用空格 进行切割 判断字符串的长度 如果长度大于2 首字母大写
        String[] strings = title.split(" ");
        int len = strings.length;
        for (int i = 0; i < len; i++) {
            if (strings[i].length() > 2) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
                strings[i] =strings[i].charAt(0)+ strings[i].substring(1).toLowerCase();
            }else {
                strings[i] = strings[i].toLowerCase();
            }

        }
        return String.join(" ", strings);
    }
}
