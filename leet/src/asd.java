/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/6 10:59
 * @注释
 */
public class asd {
    /*给定一个由n个整数组成的数组arr，使用最小运算次数使值相等，
    选择一个元素并应用运算：如果运算数为奇数（例如，第一次运算、第三运算、第五次运算.），则将元素增加1。
    a如果运算数是偶数（例如，第二次、第四十六次），则将元素增加2，或者什么也不做
    每次操作中只有一个元素可以更改。
    计算使所有元素相等所需的最小操作次数。*/
    public static void main(String[] args) {
        asd test = new asd();
        int[] arr = {1, 2, 3};
        System.out.println(test.minOperations(arr));
    }
    public int minOperations(int[] arr) {
        int n = arr.length;
        int max = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            res += max - arr[i];
        }
        return res;
    }



}
