// https://leetcode.com/problems/odd-even-linked-list/description/
package LinkedList;

public class EvenOddList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode even = head.next;
        ListNode odd = head;
        ListNode temp = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next; // pointing
            even.next = even.next.next;

            odd = odd.next; // moving
            even = even.next;
        }

        odd.next = temp;
        return head;
    }

}
