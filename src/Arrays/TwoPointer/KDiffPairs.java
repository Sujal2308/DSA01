// Leetcode link: https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
package Arrays.TwoPointer;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        int low = 0;
        int high = 1;

        while (high < nums.length) {
            int diff = Math.abs(nums[high] - nums[low]);

            while (high - low > 1 && diff > k) {
                low++;
                diff = Math.abs(nums[high] - nums[low]);
            }

            if (diff == k) {
                set.add(Arrays.asList(nums[low], nums[high]));
            }

            high++;
        }

        return set.size();
    }
}
