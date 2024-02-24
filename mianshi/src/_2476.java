import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2024/2/24 9:10
 * @注释 二叉搜索树最近节点查询
 */



public class _2476 {

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
        TreeNode treeNode = new _2476().new TreeNode(4);
        treeNode.left = new _2476().new TreeNode(2);
        treeNode.right = new _2476().new TreeNode(5);
        treeNode.left.left = new _2476().new TreeNode(1);
        treeNode.left.right = new _2476().new TreeNode(3);
        System.out.println(new _2476().closestNodes(treeNode, new ArrayList<>(List.of(3, 1))));
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        /**
         *给你一个 二叉搜索树 的根节点 root ，和一个由正整数组成、长度为 n 的数组 queries 。
         *
         * 请你找出一个长度为 n 的 二维 答案数组 answer ，其中 answer[i] = [mini, maxi] ：
         *
         * mini 是树中小于等于 queries[i] 的 最大值 。如果不存在这样的值，则使用 -1 代替。
         * maxi 是树中大于等于 queries[i] 的 最小值 。如果不存在这样的值，则使用 -1 代替。
         * 返回数组 answer 。
         *
         *
         */
        if (root == null || queries == null || queries.size() == 0) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> list = new ArrayList<>();
            int target = queries.get(i);
            TreeNode cur = root;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while (cur != null) {
                if (cur.val == target) {
                    min = target;
                    max = target;
                    break;
                } else if (cur.val < target) {
                    min = Math.max(min, cur.val);
                    cur = cur.right;
                } else {
                    max = Math.min(max, cur.val);
                    cur = cur.left;
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = -1;
            }
            if (max == Integer.MIN_VALUE) {
                max = -1;
            }
            list.add(min);
            list.add(max);
            res.add(list);
        }
        return res;

    }
}
