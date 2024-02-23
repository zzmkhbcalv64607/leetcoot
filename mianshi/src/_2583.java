import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/23 9:24
 * @注释 二叉树中的第 K 大层和
 */
public class _2583 {

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
        TreeNode treeNode = new _2583().new TreeNode(1);
        treeNode.left = new _2583().new TreeNode(7);
        treeNode.right = new _2583().new TreeNode(0);
        treeNode.left.left = new _2583().new TreeNode(7);
        treeNode.left.right = new _2583().new TreeNode(-8);
        System.out.println(new _2583().kthLargestLevelSum(treeNode, 2));
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root, 0, list);
        Collections.sort(list, (a, b) -> b - a);
        return list.get(k - 1);
    }

    private void dfs(TreeNode root, int i, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (i == list.size()) {
            list.add(root.val);
        } else {
            list.set(i, list.get(i) + root.val);
        }
        dfs(root.left, i + 1, list);
        dfs(root.right, i + 1, list);
    }
}
