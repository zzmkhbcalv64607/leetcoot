package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/20 19:09
 * @注释 二叉树的最大深度
 */
public class _104 {

     public class TreeNode {
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

    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right)+1;
        return Math.max(left,right);
    }
}
