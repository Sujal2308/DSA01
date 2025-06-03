import java.util.Arrays;

class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, -1, 0 };
    // inplace sorting
    // stable sorting
    // time complexity = O(n^2)
    // space complexity = O(1)
    // opposite of selection sort
    bubbleSort(arr);
  }

  static void bubbleSort(int[] arr) {
    boolean swap = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
          swap = true;
        }

      }
      if (!swap) {
        break;
      }else{
        swap = false;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}