package 链表;

/**
 * @version 1.0
 * @Author liyuu
 * @Date 2023/12/13 9:29
 * @注释 两两交换链表中的节点
 */
public class _24 {
    public class ListNode {
        int val;
        _24.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, _24.ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        _24 test = new _24();
        _24.ListNode head = test.new ListNode(1);
        _24.ListNode node1 = test.new ListNode(2);
        _24.ListNode node2 = test.new ListNode(3);
        _24.ListNode node3 = test.new ListNode(4);
        _24.ListNode node4 = test.new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=node4;
        node4.next=null;
        _24.ListNode result = test.swapPairs(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode swapPairs(ListNode head) {
        ListNode dumyhead = new ListNode(-1); // 设置一个虚拟头结点
        dumyhead.next = head; // 将虚拟头结点指向head，这样方便后面做删除操作
        ListNode cur = dumyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;       // 步骤一
            secondnode.next = firstnode; // 步骤二
            firstnode.next = temp;      // 步骤三
            cur = firstnode; // cur移动，准备下一轮交换
        }
        return dumyhead.next;
    }
}
