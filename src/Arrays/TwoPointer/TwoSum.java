class TwoSum {
  public static void main(String[] args) {
    int[] arr = { 2, 7, 11, 15 };
    int target = 6;
    int[] result = twoSum(arr, target);
    System.out.println(result[0] + " " + result[1]);
  }

  static int[] twoSum(int[] arr, int target) {
    // Only better if you want to return the elements not indexes
    // Time complexity : O(nlogn)
    // Space complexity : O(1);
    Arrays.sort(arr); // T.c : O(nlogn)
    int low = 0;
    int high = arr.length - 1;
    int sum = 0;
    while (low < high) { // T.c : O(n) less dominant
      sum = arr[low] + arr[high];
      if (sum == target) {
        return new int[] { arr[low], arr[high] };
      } else if (sum > target) {
        high--;
      } else {
        low++;
      }
    }
    return new int[] { -1, -1 };
  }
}