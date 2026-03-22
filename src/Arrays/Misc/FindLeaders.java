import java.util.ArrayList;

// Leaders in an array are the elements that are greater than all the elements to their right side.
// And the rightmost(last) element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

class FindLeaders {
  public static void main(String[] a) {
    int[] arr = { 16, 17, 4, 3, 5, 2 };

    System.out.println(findLeaders(arr));
  }

  static ArrayList<Integer> findLeaders(int[] arr) {
    // Time Complexity O(n)
    // Space Complexity O(n)
    int n = arr.length;
    ArrayList<Integer> list = new ArrayList<>();

    int max = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] > max) {
        max = arr[i];
        list.add(max);
      }
    }
    return list;
  }
}