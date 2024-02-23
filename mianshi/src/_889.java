import javax.swing.tree.TreeNode;
import java.util.Arrays;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/22 10:18
 * @注释  根据前序和后序遍历构造二叉树
 */
public class _889 {

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
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};
        System.out.println(new _889().constructFromPrePost(preorder, postorder));
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = preorder[0];
        if (preorder.length == 1) {
            return treeNode;
        }
        int L = 1;
        for (int i = 0; i < postorder.length; i++) {
            if (postorder[i] == preorder[1]) {
                L = i + 1;
                break;
            }
        }
        treeNode.left = constructFromPrePost(Arrays.copyOfRange(preorder, 1, L + 1), Arrays.copyOfRange(postorder, 0, L));
        treeNode.right = constructFromPrePost(Arrays.copyOfRange(preorder, L + 1, preorder.length), Arrays.copyOfRange(postorder, L, postorder.length - 1));
        return treeNode;
    }
}
