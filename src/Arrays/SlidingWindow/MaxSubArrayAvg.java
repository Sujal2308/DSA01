// problem link : https://leetcode.com/problems/maximum-average-subarray-i/description/
//! Note : Double.MIN_VALUE is not a valid value for initializing the result variable, as it represents the smallest possible double value. Instead, you can initialize it to Double.NEGATIVE_INFINITY to ensure that any valid average will be greater than this initial value.
public class MaxSubArrayAvg {
    public static void main(String[] args) {
        System.out.println(maxSubarrayAvg(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
    }

    public static double maxSubarrayAvg(int[] arr, int k) {
        // Code here
        double result = Integer.MIN_VALUE;
        double sum = 0;
        int low = 0;
        int high = 0;
        for (; high < k; high++) {
            sum = sum + nums[high];
        }
        result = Math.max(result, sum / k);

        while (high < nums.length) {
            sum = sum + nums[high] - nums[low];
            low++;
            result = Math.max(result, sum / k);
            high++;

        }

        return result;

    }
}