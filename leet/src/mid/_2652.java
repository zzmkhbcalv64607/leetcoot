package mid;

public class _2652 {
    public static void main(String[] args) {
        _2652 sol = new _2652();

        System.out.println(sol.sumOfMultiples(9));
    }

    public int sumOfMultiples(int n) {

        int i =1,flag=0;
        while(i<=n){
            if (i<3){
                i++;
                continue;

            }
            if (i%3==0||i%5==0||i%7==0){
                flag=flag+i;
            }
            i++;
        }
        return flag;
    }
}
