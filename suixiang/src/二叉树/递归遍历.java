package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/19 10:50
 * @注释 二叉树的前序遍历 递归 中左右
 */
public class 递归遍历 {

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
        System.out.println(new 递归遍历().preorderTraversal(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder1(root, list);
        return list;
    }
    //前序遍历 中左右
    public void preOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
    //中序遍历 左中右
    public void preOrder1(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        preOrder1(root.left, list);
        list.add(root.val);
        preOrder1(root.right, list);
    }
    //后序遍历 左右中
    public void preOrder2(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        preOrder2(root.left, list);
        preOrder2(root.right, list);
        list.add(root.val);
    }
}
