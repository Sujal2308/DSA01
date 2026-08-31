
// Link: https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/
import java.util.Arrays;

public class FreqOfMostFrequentItem {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4 };
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        int low = 0;
        int high = 0;
        long sum = 0;
        while (high < nums.length) {
            sum = sum + nums[high];

            if (check(nums[high], sum, k, high - low + 1)) {
                res = Math.max(res, high - low + 1);
            } else {
                while (!check(nums[high], sum, k, high - low + 1)) {
                    sum = sum - nums[low];
                    low++;
                }
            }

            high++;

        }
        return res;
    }

    public static boolean check(int high, long sum, int k, int digits) {
        long maxSum = (long) high * digits;
        if ((maxSum - sum) <= k) {
            return true;
        }
        return false;
    }
}