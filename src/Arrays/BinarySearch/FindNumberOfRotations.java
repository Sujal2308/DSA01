class FindNumberOfRotations {
  public static void main(String[] args) {
    int[] arr = { 15, 18, 2, 3, 6, 12 };
    System.out.println(findRotations(arr));
  }

  static int findRotations(int[] arr) {
    // Linear Search approach
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length - 1 && arr[i + 1] < arr[i]) {
        return i + 1;
      }
    }
    return 0;
  }
}