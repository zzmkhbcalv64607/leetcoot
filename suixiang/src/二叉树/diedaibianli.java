package 二叉树;

import java.util.*;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/19 11:17
 * @注释 二叉树的迭代遍历
 */
public class diedaibianli {
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

    public static void  main(String[] args) {
        //二叉树 [1,null,2,3]
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(new diedaibianli().preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        //先序遍历
        preorder(root, list);
        return list;
    }

    //先序遍历
    public void preorder(TreeNode root, List<Integer> list) {

            if (root == null){
                return ;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                list.add(node.val);
                if (node.right != null){
                    stack.push(node.right);
                }
                if (node.left != null){
                    stack.push(node.left);
                }
            }



        }

    public void preorder2(TreeNode root, List<Integer> list) {

        if (root == null){
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }



    }

}
