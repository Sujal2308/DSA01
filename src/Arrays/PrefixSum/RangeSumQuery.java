
// Leetcode 303. Range Sum Query - Immutable
// Link: https://leetcode.com/problems/range-sum-query-immutable/
package Arrays.PrefixSum;

class NumArray {
    int[] arr;
    int[] prefix;

    public NumArray(int[] nums) {
        this.arr = nums;
        this.prefix = new int[arr.length + 1];
        prefix[0] = 0;

        for (int i = 1; i <= arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
    }

    public int sumRange(int left, int right) {

        return prefix[right + 1] - prefix[left];

    }
}
