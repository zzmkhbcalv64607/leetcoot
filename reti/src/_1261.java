import java.util.HashSet;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/3/12 9:14
 * @注释
 */
public class _1261 {
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
        _1261 a = new _1261();
        TreeNode root = a.new TreeNode(-1);
        root.left = a.new TreeNode(-1);
        root.right = a.new TreeNode(-1);
        root.left.left = a.new TreeNode(-1);
        root.left.right = a.new TreeNode(-1);
        FindElements(root);
        System.out.println(find(1));
        System.out.println(find(3));
        System.out.println(find(5));
    }
 static HashSet<Integer> set = new HashSet<>();
    public static void FindElements(TreeNode root) {
        //通过root节点，将所有的节点的值都变成非负数
        //然后将所有的节点的值都存储到一个set中
        //然后通过set来判断是否存在
        //构建二叉树
        //将所有的节点的值都变成非负数
        //将所有的节点的值都存储到一个set中
        //通过set来判断是否存在
       dfs(root,0);


    }

    private static void dfs(TreeNode root, int i) {
        if (root == null) {
            return;
        }
        root.val = i;
        set.add(i);
        dfs(root.left,2*i+1);
        dfs(root.right,2*i+2);
    }

    public static boolean find(int target) {
        return set.contains(target);
    }
}
