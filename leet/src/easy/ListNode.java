package easy;

import mid.RemoveNthNodeFromEndofList;

public class ListNode {
    int val;
    RemoveNthNodeFromEndofList.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, RemoveNthNodeFromEndofList.ListNode next) {
        this.val = val;
        this.next = next;
    }
}
