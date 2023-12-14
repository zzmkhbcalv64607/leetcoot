package 链表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/12 11:03
 * @注释 移除链表元素
 */
public class _203 {

    public static class ListNode {
        // 结点的值
        int val;

        // 下一个结点
        ListNode next;

        // 节点的构造函数(无参)
        public ListNode() {
        }

        // 节点的构造函数(有一个参数)
        public ListNode(int val) {
            this.val = val;
        }

        // 节点的构造函数(有两个参数)
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(6);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        ListNode listNode = removeElements(head, 6);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        ListNode temp = dummyHead;
        while (temp.next!=null){
            if (temp.next.val==val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return dummyHead.next;
    }
}
