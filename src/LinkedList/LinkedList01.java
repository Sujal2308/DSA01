
class LinkedList01 {
  public static void main(String[] args) {
    CustomLL ll1 = new CustomLL();
    ll1.insertFirst(5);
    // ll1.insertFirst(4);
    // ll1.insertFirst(3);
    // ll1.insertFirst(2);

    ll1.insertLast(1);
    ll1.insertLast(2);
    ll1.insertLast(3);
    ll1.insertLast(4);

    ll1.insertAt(4, 10);

    // ll1.deleteFirst();

    ll1.display();
    System.out.println(ll1.size);

    ll1.deleteLast();
    // ll1.deleteLast();
    // ll1.deleteLast();

    System.out.println(ll1.getTail());

    ll1.deleteAt(2);

    ll1.display();
  }
}