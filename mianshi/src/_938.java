/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/26 10:01
 * @注释 二叉搜索树的范围和
 */
public class _938 {
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
        TreeNode treeNode = new _938().new TreeNode(10);
        treeNode.left = new _938().new TreeNode(5);
        treeNode.right = new _938().new TreeNode(15);
        treeNode.left.left = new _938().new TreeNode(3);
        treeNode.left.right = new _938().new TreeNode(7);
        treeNode.right.right = new _938().new TreeNode(18);
        System.out.println(new _938().rangeSumBST(treeNode, 7, 15));
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;//记录值
        if (root == null) return 0;
        if (root.val >= low && root.val <= high) {
            res += root.val;
        }
        if (root.val > low) {
            res += rangeSumBST(root.left, low, high);
        }
        if (root.val < high) {
            res += rangeSumBST(root.right, low, high);
        }
        return res;
    }
}
