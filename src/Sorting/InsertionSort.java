import java.util.Arrays;

class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 3, 4, 1, 2 };
    // Time Complexity = O(n^2);
    // Space Complexity = O(1);
    // Stable Sorting Algorithm
    // In Place Sorting Algorithm
    insertionSort(arr);

  }

  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}