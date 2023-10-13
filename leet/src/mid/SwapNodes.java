package mid;

/**
 * 24. 两两交换链表中的节点
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class SwapNodes {
    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode listNode = swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        System.out.println(listNode);
    }
    public static ListNode swapPairs(ListNode head) {
        //如果链表为空或者只有一个节点，直接返回
        if (head==null||head.next==null){
            return head;
        }

        //定义一个虚拟节点
        ListNode dummy = new ListNode(0);
        //虚拟节点的下一个节点指向head的下一个
        dummy = head.next;
        //head的下一个节点指向虚拟节点的下一个节点
        head.next=dummy.next;
        //虚拟节点的下一个节点指向head
        dummy.next=head;
        //head的下一个节点指向递归返回的数据
        head .next=swapPairs(head.next);
        return dummy;
    }
}
