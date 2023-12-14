package 链表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/13 15:32
 * @注释 删除链表的倒数第 N 个结点
 */
public class _19 {
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
        _19 test = new _19();
        _19.ListNode head = test.new ListNode(1);
        _19.ListNode node1 = test.new ListNode(2);
        _19.ListNode node2 = test.new ListNode(3);
        _19.ListNode node3 = test.new ListNode(4);
        _19.ListNode node4 = test.new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=node4;
        node4.next=null;
        _19.ListNode result = test.removeNthFromEnd(head,2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumyhead = new ListNode(-1);
        dumyhead.next=head;
        ListNode fast = dumyhead;
        ListNode slow = dumyhead;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dumyhead.next;
    }
}
