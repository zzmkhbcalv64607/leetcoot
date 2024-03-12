import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/11 20:19
 * @注释 合并两个有序数组
 */
public class _88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        new _88().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s1 =0;
        int s2 =0;
        int[] temp = new int[m+n];
        int index = 0;
        while(s1<m && s2<n){
            if(nums1[s1]<nums2[s2]){
                temp[index++] = nums1[s1++];
            }else{
                temp[index++] = nums2[s2++];
            }
        }
        while(s1<m){
            temp[index++] = nums1[s1++];
        }
        while(s2<n){
            temp[index++] = nums2[s2++];
        }
        for(int i=0;i<temp.length;i++){
            nums1[i] = temp[i];
        }


    }
}
