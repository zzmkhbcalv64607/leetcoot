package mid;

import javax.swing.tree.TreeNode;

public class _55555 {
   //二叉树的中序遍历
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(inorderTraversal(root));
    }
    public static String inorderTraversal(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(inorderTraversal(root.left));
        sb.append(root.val);
        sb.append(inorderTraversal(root.right));
        return sb.toString();
    }
}
