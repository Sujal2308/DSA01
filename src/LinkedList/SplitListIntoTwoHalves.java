// Link : https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1
package LinkedList;

public class SplitListIntoTwoHalves {

    public Pair<Node, Node> splitList(Node head) {
        // Code here

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }

        if (fast.next.next == head) {
            fast = fast.next;

        }

        fast.next = slow.next;
        slow.next = head;

        return new Pair<>(head, fast.next);

    }

}
