package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/23 9:18
 * @注释 路径总和
 */
public class _112 {
    public static void main(String[] args) {
        System.out.println(hasPathSum(new TreeNode(1,new TreeNode(2),new TreeNode(3)),5));
    }
        public static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
             }
        }

        public static boolean hasPathSum(TreeNode root, int targetSum) {
            if (root==null){
                return false;
            }
            if (root.left==null&&root.right==null){
                return targetSum==root.val;
            }
            return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
        }
}
