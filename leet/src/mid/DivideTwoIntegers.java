package mid;

/**
 * 给你两个整数，被除数 dividend 和除数 divisor。
 * 将两数相除，要求 不使用 乘法、除法和取余运算。
 */
public class DivideTwoIntegers {

    public static void   main(String[] args) {
        DivideTwoIntegers d = new DivideTwoIntegers();
        int divide = d.divide(10, 3);
        System.out.println(divide);
    }
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        // 考虑除数为最小值的情况
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        // 考虑被除数为 0 的情况
        if (dividend == 0) {
            return 0;
        }

        int flag=0;
        int result=0;
        if (dividend<0){
            flag++;
        }
        if (divisor<0){
            flag++;
        }
        //1 2 3 4
        int value=0;
        if(dividend>0) {
            dividend = -dividend;
        }
        if(divisor>0) divisor = -divisor;


        while (divisor>=dividend){
           int tmp =divisor,count=1;
              while (dividend-tmp<=tmp){
                tmp+=tmp;
               count+=count;
              }

                dividend-=tmp;
              value+=count;
        }
 ;
return flag==1?-value:value;
    }
}
