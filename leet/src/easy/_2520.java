package easy;

public class _2520 {
    public static void main(String[] args) {
        _2520 test = new _2520();
        System.out.println(test.countDigits(121));
    }
    //冒泡排序
    //q:给定一个整数数组 nums，请你将该数组升序排列。
    //a:
    //



    public int countDigits(int num) {

        int flag =0;
        int ww=num;
        while (ww%10!=0){
            int a=ww%10;
          ww=ww/10;
            if (num%a==0){
                flag++;
            }
        }

    return flag;
    }
}
