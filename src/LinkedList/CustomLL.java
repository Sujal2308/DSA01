public class CustomLL {
  // what does linkedList have
  private Node head;
  private Node tail;
  int size;

  public CustomLL() {
    size = 0;
  }

  public void insertFirst(int value) {
    Node n = new Node(value);
    n.next = head;
    head = n;
    if (tail == null) {
      tail = n;
    }
    size++;

  }

  public void insertLast(int value) {
    Node n = new Node(value);
    if (head == null) {
      head = n;
      tail = n;
      return;
    }
    tail.next = n;
    tail = n;

    size++;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void insertAt(int index, int value) {
    Node temp = head;
    if (index == 0) {
      insertFirst(value);
      return;
    }
    if (index == size) {
      insertLast(value);
      return;
    }
    while (index > 1) {
      temp = temp.next;
      index--;
    }
    Node n = new Node(value, temp.next);
    temp.next = n;
    size++;
    // n.next = temp.next;
    // temp.next = n;
  }

  public void deleteFirst() {
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
  }

  public void deleteLast() {
    Node temp = head;
    for (int i = 0; i < size - 2; i++) {
      temp = temp.next;
    }
    tail = temp;
    tail.next = null;
    size--;
  }

  public void deleteAt(int index) {
    Node temp = head;
    while (index > 1) {
      temp = temp.next;
      index--;
    }
    temp = temp.next;
  }

  public int getTail() {
    return tail.data;
  }

  class Node {
    private int data;
    Node next;

    Node(int value) {
      this.data = value;
    }

    Node(int value, Node next) {
      this.data = value;
      this.next = next;
    }

  }
}
