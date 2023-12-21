package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/20 10:13
 * @注释 N 叉树的层序遍历
 */
public class _429 {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {
        Node node  =  new Node(1,
                List.of(new Node(3,
                        List.of(new Node(5), new Node(6))),
                        new Node(2),
                        new Node(4)));
        List<List<Integer>> list = new _429().levelOrder(node);
        System.out.println(list);
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return  list;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()){
            ArrayList<Integer> list1 = new ArrayList<>();
            int  size = nodes.size();
            while (size>0){
                Node node = nodes.poll();
                list1.add(node.val);
                if (node.children!=null){
                    for (Node child : node.children) {
                        nodes.offer(child);
                    }
                }
                size--;
            }
            list.add(list1);
        }
return list;
    }
}
