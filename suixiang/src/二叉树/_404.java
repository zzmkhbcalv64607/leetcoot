package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/22 9:44
 * @注释 左叶子之和 叶子节点是指没有子节点的节点
 */
public class _404 {

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
        System.out.println(sumOfLeftLeaves(new TreeNode(1,new TreeNode(2),new TreeNode(3))));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
                return 0;
            }
        int left =sumOfLeftLeaves(root.left);
        int right =sumOfLeftLeaves(root.right);

        if (root.left!=null&&root.left.left==null&&root.left.right==null){
            return left+right+root.left.val;
        }
        return left+right;
    }
}
