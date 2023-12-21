package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/20 19:26
 * @注释
 */
public class _111 {
    public int minDepth(_104.TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = minDepth(root.left)+1;
        int right = minDepth(root.right)+1;
        return Math.min(left,right);
    }
}
