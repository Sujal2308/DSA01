// Link : https://leetcode.com/problems/reverse-linked-list/
package LinkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode front = curr.next;

        prev.next = null;
        while (front != null) {
            ListNode temp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = temp;

            front = front.next;
        }
        curr.next = prev;

        return curr;
    }
}
