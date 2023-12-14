package 链表;

import java.util.HashMap;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/14 10:02
 * @注释 环形链表 II
 */
public class _142 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


    public static void main(String[] args) {
        _142 test = new _142();
        _142.ListNode head = test.new ListNode(1);
        _142.ListNode node1 = test.new ListNode(2);
        _142.ListNode node2 = test.new ListNode(3);
        _142.ListNode node3 = test.new ListNode(4);
        _142.ListNode node4 = test.new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=node4;
        node4.next=node1;
        _142.ListNode result = test.detectCycle(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode detectCycle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {// 有环
                    ListNode index1 = fast;
                    ListNode index2 = head;
                    // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
                    while (index1 != index2) {
                        index1 = index1.next;
                        index2 = index2.next;
                    }
                    return index1;
                }
            }
            return null;

    }
}
