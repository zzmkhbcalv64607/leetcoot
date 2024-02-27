/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/25 9:27
 * @注释 二叉搜索树的最近公共祖先
 */
public class _235 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        TreeNode treeNode = new _235().new TreeNode(6);
        treeNode.left = new _235().new TreeNode(2);
        treeNode.right = new _235().new TreeNode(8);
        treeNode.left.left = new _235().new TreeNode(0);
        treeNode.left.right = new _235().new TreeNode(4);
        treeNode.left.right.left = new _235().new TreeNode(3);
        treeNode.left.right.right = new _235().new TreeNode(5);
        treeNode.right.left = new _235().new TreeNode(7);
        treeNode.right.right = new _235().new TreeNode(9);
        System.out.println(new _235().lowestCommonAncestor(treeNode, treeNode.left, treeNode.right).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val > q.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        while (root != null) {
            if (root.val < p.val) {
                root = root.right;
            } else if (root.val > q.val) {
                root = root.left;
            } else {
                break;
            }
        }
        return root;
    }
}
