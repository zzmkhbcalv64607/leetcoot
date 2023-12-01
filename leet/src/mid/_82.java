package mid;

public class _82 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void main(String[] args) {
        ListNode listNode = new _82().deleteDuplicates(new ListNode(1, new ListNode
                (2, new ListNode(3, new ListNode(
                        3, new ListNode(4, new ListNode(
                        4, new ListNode(5))))))));
        System.out.println(listNode);

    }



    public ListNode deleteDuplicates(ListNode head) {
        if (head ==null){
            return null;
        }
        ListNode te=new ListNode();
        te.next=head;
        if (head.next==head.next.next){
            head.next=head.next.next.next;
        }
        return head;
    }
}
