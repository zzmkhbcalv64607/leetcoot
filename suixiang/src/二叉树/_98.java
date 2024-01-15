package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/13 11:42
 * @注释 验证二叉搜索树
 */
public class _98 {

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
        System.out.println(new _98().isValidBST(new _98().new TreeNode(1,new _98().new TreeNode(2),new _98().new TreeNode(3))));
    }
    TreeNode max;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        // 中
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        // 右
        boolean right = isValidBST(root.right);
        return right;
    }

}
