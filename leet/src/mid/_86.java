package mid;




public class _86 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode listNode = new _86().partition(new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(
                2, new ListNode(5, new ListNode(
                2)))))),3);
        System.out.println(listNode);
    }
    public ListNode partition(ListNode head, int x) {
        ListNode tt =new ListNode(0);
        ListNode aa =new ListNode(0);
        ListNode ls=tt;
        ListNode largeHead =aa;
        while (head!=null){
                if (head.val<x){
                    tt.next= head;
                    tt=tt.next;

                }
            if (head.val >= x) {
                aa.next= head;
                aa=aa.next;
            }
            head=head.next;
        }
      aa.next=null;
        tt.next=largeHead.next;
        return ls.next;
    }
}
