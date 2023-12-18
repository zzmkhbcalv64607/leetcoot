package 哈希表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/15 10:21
 * @注释 快乐数
 */
public class _202 {
    public static void main(String[] args) {
        _202 test = new _202();
        System.out.println(test.isHappy(19));
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast!=1&&slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        return fast==1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n>0){
            int d = n%10;
            n=n/10;
            sum+=d*d;
        }
        return sum;
    }
}
