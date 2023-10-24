package mid;

/**
 * 给你一个下标从 0 开始的字符串 details 。details
 * 中每个元素都是一位乘客的信息，信息用长度为 15 的字符串表示，表示方式如下：
 *
 * 前十个字符是乘客的手机号码。
 * 接下来的一个字符是乘客的性别。
 * 接下来两个字符是乘客的年龄。
 * 最后两个字符是乘客的座位号。
 * 请你返回乘客中年龄 严格大于 60 岁 的人数。
 */
public class _2678 {
    public static void main(String[] args) {
        _2678 o = new _2678();
        String[] details = {"9751302862F0693","3888560693F7262","5485983835F0649","2580974299F6042"
                ,"9976672161M6561","0234451011F8013","4294552179O6482"};
        System.out.println(o.countSeniors(details));
    }
    public int countSeniors(String[] details) {
        int i=0,flag =0;

        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11,13))>=60){
                flag++;
            }
        }

        return flag;
    }
}
