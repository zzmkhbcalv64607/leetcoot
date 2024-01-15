package 二叉树;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/1/12 10:22
 * @注释 合并二叉树
 */
public class _617 {
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
       // System.out.println(new _617().mergeTrees(new _617().new TreeNode(1,new _617().new TreeNode(2),new _617().new TreeNode(3)),new _617().new TreeNode(1,new _617().new TreeNode(2),new _617().new TreeNode(3))));
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1==null){
                return root2;
            }
            if (root2==null){
                return root1;
            }
            TreeNode root = new TreeNode(root1.val+root2.val);
            root.left = mergeTrees(root1.left,root2.left);
            root.right = mergeTrees(root1.right,root2.right);
            return root;
    }
}
