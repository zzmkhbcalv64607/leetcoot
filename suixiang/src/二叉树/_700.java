package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/12 10:34
 * @注释 二叉搜索树中的搜索
 */
public class _700 {

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

        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null || root.val == val) return root;
            return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
        }




}


