import java.util.Arrays;

class MoveZeros {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0 };
    moveZerosToEnd(arr);
  }

  static void moveZerosToEnd(int[] nums) {
    // Apply same logic as removing duplicates from sorted array
    int i = 0;
    for (int j = i; j < nums.length; j++) {
      if (nums[j] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}