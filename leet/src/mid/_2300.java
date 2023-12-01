package mid;

import java.util.Arrays;

public class _2300 {
    public static void main(String[] args) {
        _2300 test = new _2300();
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        long success = 16;
        System.out.println(Arrays.toString(test.successfulPairs(spells, potions, success)));
    }
    public int[] successfulPairs(int[] a, int[] b, long t) {
        int n = a.length, m = b.length;
        int[] ans = new int[n];
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            double cur = t * 1.0 / a[i];//目标值-药水的最低强度
            int l = 0, r = m - 1;
            //二分查找
            while (l < r) {
                int mid = l + r >> 1;
                if (b[mid] >= cur) r = mid;
                else l = mid + 1;
            }
            //当找到第一个满足要求的药水时，由于已经排过序了，后面的都满足，因此为m-r
            if (b[r] * 1L * a[i] >= t) ans[i] = m - r;
        }
        return ans;

    }
}
