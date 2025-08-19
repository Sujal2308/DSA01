
public class CustomLL {
  // Custom Linked List implementation
  // A linked list consists of nodes where each node contains data and a reference
  // to the next node

  // Instance variables to maintain the linked list structure
  private Node head; // Points to the first node in the list
  private Node tail; // Points to the last node in the list (for efficient insertLast operation)
  int size; // Keeps track of the number of elements in the list

  // Constructor: Initialize an empty linked list
  public CustomLL() {
    size = 0; // Start with size 0 as the list is empty
    // head and tail are null by default
  }

  // Insert a new element at the beginning of the list
  // Time Complexity: O(1) - constant time operation
  public void insertFirst(int value) {
    Node n = new Node(value); // Create a new node with the given value
    n.next = head; // Point the new node to the current head
    head = n; // Update head to point to the new node

    // If this is the first node being added, it's both head and tail
    if (tail == null) {
      tail = n;
    }
    size++; // Increment the size counter
  }

  // Insert a new element at the end of the list
  // Time Complexity: O(1) - constant time operation (thanks to tail pointer)
  public void insertLast(int value) {
    Node n = new Node(value); // Create a new node with the given value

    // Special case: if list is empty, new node becomes both head and tail
    if (head == null) {
      head = n;
      tail = n;
      size++;
      return;
    }

    // Normal case: link the current tail to the new node and update tail
    tail.next = n; // Current tail points to new node
    tail = n; // Update tail to point to the new node
    size++; // Increment the size counter
  }

  // Display all elements in the linked list
  // Time Complexity: O(n) - must traverse all nodes
  public void display() {
    Node temp = head; // Start from the head

    // Traverse through each node and print its data
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next; // Move to the next node
    }
    System.out.println("null"); // Indicate end of list
  }

  // Insert a new element at a specific index
  // Time Complexity: O(n) in worst case - may need to traverse to the index
  public void insertAt(int index, int value) {
    // Edge case: if index is 0, insert at the beginning
    if (index == 0) {
      insertFirst(value);
      return;
    }

    // Edge case: if index equals size, insert at the end
    if (index == size) {
      insertLast(value);
      return;
    }

    // General case: traverse to the position before the desired index
    Node temp = head;
    while (index > 1) { // Stop at the node before the insertion point
      temp = temp.next;
      index--;
    }

    // Create new node and link it properly
    Node n = new Node(value, temp.next); // New node points to temp's next
    temp.next = n; // temp now points to new node
    size++; // Increment size counter
  }

  // Delete the first element from the list
  // Time Complexity: O(1) - constant time operation
  public void deleteFirst() {
    head = head.next; // Move head to the next node (effectively removing first)

    // If list becomes empty after deletion, update tail to null
    if (head == null) {
      tail = null;
    }
    size--; // Decrement size counter
  }

  // Delete the last element from the list
  // Time Complexity: O(n) - need to traverse to second-to-last node
  public void deleteLast() {
    Node temp = head;

    // Traverse to the second-to-last node
    for (int i = 0; i < size - 2; i++) {
      temp = temp.next;
    }

    // Update tail to second-to-last node and break the link
    tail = temp;
    tail.next = null; // Remove connection to the last node
    size--; // Decrement size counter
  }

  // Delete element at a specific index
  // Time Complexity: O(n) - may need to traverse to the index
  // Note: This method has a bug - it doesn't properly update links
  public void deleteAt(int index){
      if(index==0){
          deleteFirst();
          return;
      }
      if(index==size-1){
          deleteLast();
          return;
      }
      Node temp = head;
      for(int i = 1; i<index; i++){
          temp = temp.next; //2
      }
      temp.next = temp.next.next;

  }

  // Get the data value of the tail (last) element
  // Time Complexity: O(1) - direct access through tail pointer
  public int getTail() {
    return tail.data;
  }

  // Inner Node class to represent individual elements in the linked list
  class Node {
    private int data; // The actual data stored in this node
    Node next; // Reference to the next node in the list

    // Constructor: Create a node with just data (next will be null)
    Node(int value) {
      this.data = value;
    }

    // Constructor: Create a node with data and specify the next node
    Node(int value, Node next) {
      this.data = value;
      this.next = next;
    }
  }
}
