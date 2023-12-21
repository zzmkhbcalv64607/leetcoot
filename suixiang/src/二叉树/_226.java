package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/21 9:18
 * @注释 翻转二叉树
 */
public class _226 {


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
        System.out.println(invertTree(new TreeNode(1,new TreeNode(2),new TreeNode(3))));
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode temp =root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
