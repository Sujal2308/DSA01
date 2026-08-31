// https://leetcode.com/problems/add-two-numbers/description/
package LinkedList;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        int sum = 0;
        int carry = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;

            carry = sum > 9 ? 1 : 0;
            temp.next = carry == 1 ? new ListNode(sum % 10) : new ListNode(sum);

            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + carry;
            carry = sum > 9 ? 1 : 0;
            temp.next = carry == 1 ? new ListNode(sum % 10) : new ListNode(sum);
            l1 = l1.next;
            temp = temp.next;
        }

        while (l2 != null) {
            sum = l2.val + carry;
            carry = sum > 9 ? 1 : 0;
            temp.next = carry == 1 ? new ListNode(sum % 10) : new ListNode(sum);
            l2 = l2.next;
            temp = temp.next;
        }

        if (carry == 1) {
            temp.next = new ListNode(1);
        }

        return l3.next;
    }
}
