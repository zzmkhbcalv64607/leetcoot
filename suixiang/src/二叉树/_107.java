package 二叉树;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/19 15:10
 * @注释 二叉树的层序遍历 II
 */
public class _107 {
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
        List<List<Integer>> list = levelOrderBottom(root);
        System.out.println(list);
    }

    public  static List<List<Integer>> levelOrderBottom(TreeNode node) {

        List<List<Integer>> resList = new ArrayList<>();
        if (node == null) return resList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            while (len>0){
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left!=null)queue.offer(poll.left);
                if (poll.right!=null)queue.offer(poll.right);
                len --;
            }
            resList.add(list);
        }

         Collections.reverse(resList);
        return resList;
    }
}
