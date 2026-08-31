package LinkedList;

public class AddOneToList {

    public Node addOne(Node head) {
        // code here.
        Node head2 = reverse(head);
        Node temp = head2;
        int carry = 1;
        Node prev = temp;
        while (carry != 0 && temp != null) {
            int sum = temp.data + carry;

            if (sum == 10) {
                temp.data = 0;
                prev = temp;
                temp = temp.next;
            } else {
                temp.data = sum;
                carry = 0;
            }
        }

        if (carry == 1) {
            prev.next = new Node(1);
        }

        head2 = reverse(head2);
        return head2;

    }

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = head;
        Node curr = prev.next;
        Node front = curr.next;

        prev.next = null;
        while (front != null) {
            Node temp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = temp;

            front = front.next;
        }
        curr.next = prev;

        return curr;
    }
}
