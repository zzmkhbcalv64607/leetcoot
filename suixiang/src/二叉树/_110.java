package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/21 10:14
 * @注释 平衡二叉树
 */
public class _110 {

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

    public static void main(String[] args) {
        System.out.println(isBalanced(new TreeNode(1,new TreeNode(2),new TreeNode(3))));
    }
    public static boolean isBalanced(TreeNode root) {
          if (root==null){
              return true;
          }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            if (Math.abs(left-right)>1){
                return false;
            }
            return isBalanced(root.left)&&isBalanced(root.right);
    }

    private static int maxDepth(TreeNode node) {
            if (node==null){
                return 0;
            }
            int left = maxDepth(node.left)+1;
            int right = maxDepth(node.right)+1;
            return Math.max(left,right);
    }


}
