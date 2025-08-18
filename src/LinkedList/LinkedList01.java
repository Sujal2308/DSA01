
class LinkedList01 {
  public static void main(String[] args) {
    // Create a new instance of our custom linked list
    CustomLL ll1 = new CustomLL();

    // Insert element at the beginning of the list
    // List after this operation: 5 -> null
    ll1.insertFirst(5);

    // These insertFirst operations are commented out
    // If uncommented, they would add elements at the beginning
    // Order would be: 2 -> 3 -> 4 -> 5 -> null (newest first)
    // ll1.insertFirst(4);
    // ll1.insertFirst(3);
    // ll1.insertFirst(2);

    // Insert elements at the end of the list
    // List after insertLast(1): 5 -> 1 -> null
    ll1.insertLast(1);
    // List after insertLast(2): 5 -> 1 -> 2 -> null
    ll1.insertLast(2);
    // List after insertLast(3): 5 -> 1 -> 2 -> 3 -> null
    ll1.insertLast(3);
    // List after insertLast(4): 5 -> 1 -> 2 -> 3 -> 4 -> null
    ll1.insertLast(4);

    // Insert element at specific index (4) with value 10
    // Index 0=5, 1=1, 2=2, 3=3, 4=4, so we insert at the end
    // List after insertAt(4, 10): 5 -> 1 -> 2 -> 3 -> 4 -> 10 -> null
    ll1.insertAt(4, 10);

    // Delete first element operation is commented out
    // If uncommented, it would remove the head element (5)
    // ll1.deleteFirst();

    // Display the current state of the linked list
    // Output: 5 -> 1 -> 2 -> 3 -> 4 -> 10 -> null
    ll1.display();

    // Print the current size of the linked list
    // Output: 6 (total number of elements)
    System.out.println(ll1.size);

    // Remove the last element from the list
    // List after deleteLast(): 5 -> 1 -> 2 -> 3 -> 4 -> null
    ll1.deleteLast();

    // These deleteLast operations are commented out
    // If uncommented, they would remove more elements from the end
    // ll1.deleteLast();
    // ll1.deleteLast();

    // Get and print the data of the tail (last) element
    // Output: 4 (the last element after deleting 10)
    System.out.println(ll1.getTail());

    // Delete element at index 2
    // Current list: 5 -> 1 -> 2 -> 3 -> 4 -> null (indices: 0, 1, 2, 3, 4)
    // After deleteAt(2): 5 -> 1 -> 3 -> 4 -> null (element with value 2 is removed)
    ll1.deleteAt(2);

    // Display the final state of the linked list
    // Output: 5 -> 1 -> 3 -> 4 -> null
    ll1.display();
  }
}