package 链表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/12 16:03
 * @注释 反转链表
 */
public class _206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        _206 test = new _206();
        ListNode head = test.new ListNode(1);
        ListNode node1 = test.new ListNode(2);
        ListNode node2 = test.new ListNode(3);
        ListNode node3 = test.new ListNode(4);
        ListNode node4 = test.new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=node4;
        node4.next=null;
        ListNode result = test.reverseList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode reverseList(ListNode head) {
            ListNode pre =null;
            ListNode cur = head;
            while (cur!=null){
                ListNode temp = cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;
            }
            return pre;
    }
}
