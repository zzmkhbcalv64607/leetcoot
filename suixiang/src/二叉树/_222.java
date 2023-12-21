package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/21 10:00
 * @注释 完全二叉树的节点个数
 */
public class _222 {


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
        System.out.println( countNodes(new TreeNode(1,new TreeNode(2),new TreeNode(3))));
    }
    public static int countNodes(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }
}
