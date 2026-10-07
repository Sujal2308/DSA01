// LeetCode problem: 1004. Max Consecutive Ones III
//  https://leetcode.com/problems/max-consecutive-ones-iii/     
// description: Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
package Arrays.SlidingWindow;

public class MaxConsectiveOnesIII {

    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int cnt0 = 0;
        int res = 0;
        while (high < nums.length) {
            int val = nums[high];

            if (val == 0)
                cnt0++;
            while (cnt0 > k) {
                if (nums[low] == 0) {
                    cnt0--;
                }
                low++;
            }

            res = Math.max(res, high - low + 1);
            high++;
        }

        return res;
    }

}
