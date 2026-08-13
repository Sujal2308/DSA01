package Stack;

public class CustomStack {

    private int[] arr;
    private static final int CAPACITY = 10;
    private int pt = -1;

    public CustomStack() {
        super(CAPACITY);
    }

    public CustomStack(int size) {
        this.arr = new int[size];
    }

    // ! push operation
    public boolean push(int item) {
        if (pt == arr.length - 1) {
            throw new Exception("Stack is full can't insert");
        }
        pt++;
        arr[pt] = item;
    }

    // ! pop operation
    public int pop() {
        if (pt == -1) {
            throw new Exception("Can't pop from empty stack");
        }
        return arr[pt--];
    }

    // ! peek operation

    public int peek() {
        if (pt == -1) {
            throw new Exception("Can't peek to empty stack");
        }
        return arr[pt];
    }

}
