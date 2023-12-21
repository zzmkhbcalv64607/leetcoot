package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/21 9:35
 * @注释 对称二叉树
 */
public class _101 {


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
        System.out.println( isSymmetric(new TreeNode(1,new TreeNode(2),new TreeNode(3))));
    }
    public static boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return isSymmetrics(root.left,root.right);
    }

    private static boolean isSymmetrics(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        return isSymmetrics(left.left,right.right)&&isSymmetrics(left.right,right.left);
    }
}
