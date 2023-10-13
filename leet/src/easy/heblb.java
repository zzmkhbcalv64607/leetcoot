package easy;

import mid.RemoveNthNodeFromEndofList;

public class heblb {
    public static   ListNode head=new ListNode(0);

    public  static class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode listNode = mergeTwoLists(new ListNode(1, new ListNode(2,new ListNode(4))), new ListNode(1, new ListNode(3,new ListNode(4))));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }
        else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

    }



}
