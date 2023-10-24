package mid;

public class _50 {
    public static void main(String[] args) {
        _50 sol = new _50();
        System.out.println(sol.myPow(2.00000, 4));
    }
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? pow(x, N) : 1.0 / pow(x, -N);

    }

    public double  pow(double  x, long y) {
        if (y == 0) {
            return 1.0;
        }
        double ret = pow(x, y / 2);
        return y % 2 == 0 ? ret * ret : ret * ret * x;
    }


}
