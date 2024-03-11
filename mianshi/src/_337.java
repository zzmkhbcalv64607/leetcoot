/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/5 9:58
 * @注释 打家劫舍 III
 */
public class _337 {
//    public int rob(TreeNode root) {
//        int[] res = dp(root);
//        return Math.max(res[0], res[1]);
//    }
//
//    private int[] dp(TreeNode root) {
//        //递推公式 dp[i][0] = max(dp[i.left][0],dp[i.left][1])+max(dp[i.right][0],dp[i.right][1])
//        //递推公式 dp[i][1] = i.val+dp[i.left][0]+dp[i.right][0]
//        if (root == null) {
//            return new int[]{0, 0};
//        }
//        int[] left = dp(root.left);
//        int[] right = dp(root.right);
//        int selected = root.val + left[0] + right[0];
//        int notSelected = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
//        return new int[]{notSelected, selected};
//
//    }
}
