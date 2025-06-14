class BS02 {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };
    System.out.println(bSearch(arr, 0, arr.length - 1, 30));
  }

  static int bSearch(int[] arr, int low, int high, int target) {
    // Time Complexity: O(logn)
    // Space Complexity: O(logn)
    // Binary Search using recursion
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] > target) {
      return bSearch(arr, low, mid - 1, target);
    } else {
      return bSearch(arr, mid + 1, high, target);
    }
  }
}