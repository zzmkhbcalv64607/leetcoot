package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/19 15:10
 * @注释 二叉树的右视图
 */
public class _515 {
    public static class  TreeNode {
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
        //二叉树 [1,null,2,3]
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> list = rightSideView(root);
        System.out.println(list);
    }

    public static List<Integer> rightSideView(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();

        if (node == null) return list;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(node);

        while (!que.isEmpty()) {

            int len = que.size();

            while (len > 0) {
                TreeNode tmpNode = que.poll();
                if (len - 1 == 0) {
                    list .add(tmpNode.val);
                }


                if (tmpNode.left != null) que.offer(tmpNode.left);
                if (tmpNode.right != null) que.offer(tmpNode.right);
                len--;
            }
        }
         return list;
    }

}
