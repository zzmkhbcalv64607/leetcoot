package 链表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/14 9:09
 * @注释 相交链表
 */
public class _160 {

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
        _160 test = new _160();
        _160.ListNode headA = test.new ListNode(4);
        _160.ListNode node1 = test.new ListNode(1);
        _160.ListNode node2 = test.new ListNode(8);
        _160.ListNode node3 = test.new ListNode(4);
        _160.ListNode node4 = test.new ListNode(5);
        _160.ListNode headB = test.new ListNode(5);
        _160.ListNode node5 = test.new ListNode(0);
        _160.ListNode node6 = test.new ListNode(1);
        headA.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=node4;
        node4.next=null;
        headB.next=node5;
        node5.next=node6;
        node6.next=node2;
        ListNode result = test.getIntersectionNode(headA,headB);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode dumyheadA = new ListNode(-1);
        ListNode dumyheadB = new  ListNode(-1);
        dumyheadA.next=headA;
        dumyheadB.next=headB;
        while (dumyheadA.next!=null){
            lenA++;
            dumyheadA=dumyheadA.next;
        }
        while (dumyheadB.next!=null){
            lenB++;
            dumyheadB=dumyheadB.next;
        }

        if (lenA>lenB){
            for (int i = 0; i < lenA-lenB; i++) {
                headA=headA.next;
            }
        }else {
            for (int i = 0; i < lenB-lenA; i++) {
                headB=headB.next;
            }
        }

        while (headA!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
