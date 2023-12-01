package easy;

public class _83 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode listNode = new _83().deleteDuplicates(new ListNode(1, new ListNode
                (2, new ListNode(3, new ListNode(
                        3, new ListNode(4, new ListNode(
                        4, new ListNode(5))))))));
        System.out.println(listNode);

    }



    public ListNode deleteDuplicates(ListNode head) {
        if (head ==null){
            return null;
        }
        ListNode ww=new ListNode(0,head);
      //
       while (ww.next.next!=null){
           if (ww.val==ww.next.val){
               ww.next=ww.next.next;
           }
           ww=ww.next;
       }
       return head;
    }
}
