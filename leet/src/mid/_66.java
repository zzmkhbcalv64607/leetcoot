package mid;

public class _66 {
    public static void main(String[] args) {
        _66 test = new _66();
        int[] digits = {9,9};
        int[] res = test.plusOne(digits);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public int[] plusOne(int[] digits) {

        for ( int i =digits.length-1;i>-1;i--){
            digits[i]++;
            if (digits[i]==10){
                digits[i]=digits[i]%10;
                continue;
            }
            return digits;
        }
        digits = new int[digits.length + 1];
      digits[0]=1;
        return digits;
    }
}
