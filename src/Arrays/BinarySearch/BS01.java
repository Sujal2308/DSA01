class BS01 {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };
    System.out.println(binarySearch(arr, 30));
  }

  static int binarySearch(int[] arr, int target) {

    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    // Binary Search is only applicable for sorted arrays and it is a divide and conquer algorithm.
    
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] > target) { // lies in left
        high = mid - 1;
      } else if (arr[mid] < target) { // lies in right
        low = mid + 1;
      } else {
        return mid; // target found
      }
    }
    return -1;
  }
}