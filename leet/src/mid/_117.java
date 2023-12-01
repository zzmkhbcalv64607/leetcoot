package mid;

public class _117 {
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
        Node node = new _117().connect(new Node(1, new Node(2,
                new Node(4), new Node(5), null),
                new Node(3, new Node(6), new Node(7), null), null));
        System.out.println(node);
    }
    public Node connect(Node root) {
        if (root==null){
            return null;
        }
        Node leftmost=root;
        while (leftmost.left!=null){
            Node head=leftmost;
            while (head!=null){
                head.left.next=head.right;
                if (head.next!=null){
                    head.right.next=head.next.left;
                }
                head=head.next;
            }
            leftmost=leftmost.left;
        }
        return root;
    }
}
