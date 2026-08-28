// Link : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right
package Arrays.Basics;

public class ReplaceElementsWithGreatest {

    public int[] replaceElements(int[] arr) {
        int[] nums = new int[arr.length];
        int max = -1;
        nums[nums.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            max = Math.max(arr[i + 1], max);
            nums[i] = max;
        }

        return nums;
    }
}
