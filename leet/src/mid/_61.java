package mid;

/**
 * 给你一个链表的头节点 head ，旋转链表
 * ，将链表每个节点向右移动 k 个位置。
 */
public class _61 {

    public static void main(String[] args) {
        _61 o = new _61();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);

        head.next=head1;
        head1.next=head2;

        ListNode listNode = rotateRight(head, 4);
        System.out.println(listNode.val);
    }


    public static class   ListNode {
     int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }}

    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode a = head;
        int c=0;
        while (a!=null){
            a=a.next;
            c++;
        }
        k=k%(c);
        while (k>0){
            ListNode temp = head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            ListNode temp1 = temp.next;
            temp.next=null;
            temp1.next=head;
            head=temp1;
            k--;
        }
        return head;
    }
}
