package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/20 16:58
 * @注释 填充每个节点的下一个右侧节点指针
 */
public class _116 {
    static class  Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(6);
        node.right.right.right = new Node(7);
        node.right.right.right.right = new Node(8);
        node.right.right.right.right.right = new Node(9);
        Node node1 = new _116().connect(node);
        System.out.println(node1.val);
    }

    public Node connect(Node root) {
        Queue<Node> tmpQueue = new LinkedList<Node>();
        if (root != null) tmpQueue.add(root);

        while (tmpQueue.size() != 0){
            int size = tmpQueue.size();

            Node cur = tmpQueue.poll();
            if (cur.left != null) tmpQueue.add(cur.left);
            if (cur.right != null) tmpQueue.add(cur.right);

            for (int index = 1; index < size; index++){
                Node next = tmpQueue.poll();
                if (next.left != null) tmpQueue.add(next.left);
                if (next.right != null) tmpQueue.add(next.right);

                cur.next = next;
                cur = next;
            }
        }

        return root;
    }
}
