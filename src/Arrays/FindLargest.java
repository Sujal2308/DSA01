class FindLargest {
  public static void main(String[] args) {
    int[] arr = { 10, 22, 3, 0, 1, 6, 2, 100 };
    int max = maxItemFromArray(arr);
    System.out.println(max);
  }

  static int maxItemFromArray(int[] arr) {
    if (arr.length == 1) {
      return arr[0];
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}