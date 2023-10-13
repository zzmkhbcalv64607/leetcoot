package mid;
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
public class RemoveNthNodeFromEndofList {

     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        removeNthFromEnd(head,2);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode pre = new ListNode(0);
       ListNode m=pre;
       pre.next=head;
       //双指针 快慢指针 12345  删除倒数第二个时，先让快指针走两步，然后快慢指针一起走，当快指针走到最后一个时，慢指针的下一个就是要删除的节点
       for (int i=0;i<n;i++){
           head=head.next;
       }
         while (head!=null){
              head=head.next;
              m=m.next;
         }
         m.next=m.next.next;
        return pre.next;
    }

}
