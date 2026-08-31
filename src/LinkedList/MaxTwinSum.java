// Leetcode 2130 : https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
package LinkedList;

public class MaxTwinSum {

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = curr.next;

        while (curr != null && curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        prev = curr;

        int max = Integer.MIN_VALUE;
        ListNode temp = head;
        while (prev != null) {
            int sum = temp.val + prev.val;
            max = Math.max(sum, max);
            prev = prev.next;
            temp = temp.next;
        }

        return max;

    }
}
