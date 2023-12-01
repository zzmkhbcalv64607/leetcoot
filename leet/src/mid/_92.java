package mid;

public class _92 {

    public class ListNode {
     int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        _92 test = new _92();
        ListNode head = test.new ListNode(1);
        ListNode head1 = test.new ListNode(2);
        ListNode head2 = test.new ListNode(3);
        ListNode head3 = test.new ListNode(4);
        ListNode head4 = test.new ListNode(5);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        ListNode listNode = test.reverseBetween(head, 2, 4);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    public ListNode reverseBetween(ListNode head, int n, int m) {
        // 定义一个dummyHead, 方便处理
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        // 初始化指针
        ListNode g = dummyHead;
        ListNode p = dummyHead.next;

        // 将指针移到相应的位置
        for(int step = 0; step < m - 1; step++) {
            g = g.next; p = p.next;
        }

        // 头插法插入节点
        for (int i = 0; i < n - m; i++) {
            ListNode removed = p.next;
            p.next = p.next.next;

            removed.next = g.next;
            g.next = removed;
        }

        return dummyHead.next;


    }
}
