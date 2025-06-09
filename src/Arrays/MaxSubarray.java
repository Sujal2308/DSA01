class MaxSubarray{

  // Kadane's Algorithm
  // Time Complexity : O(n)
  // Space Complexity : O(1)
  //The subarray is the contiguous subarray within a one-dimensional numeric array that has the largest sum.
  public static void main(String[] args){
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    int maxSum = findMaxSubarray(arr);
    System.out.println(maxSum);
  }
  public static int findMaxSubArray(int[] nums) {
    if (nums.length == 1) {
        return nums[0];
    }
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if (sum > max) {
            max = sum;
        }

        if (sum < 0) {
            sum = 0;
        }

    }
    return max;
}
}