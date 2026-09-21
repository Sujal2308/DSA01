// Leetcode 31. Next Permutation
// Link: https://leetcode.com/problems/next-permutation/

package Arrays.Misc;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;

        // identify the break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // if no breakpoint found it means we have final permutation so reverse entire
        // array
        if (pivot == -1) {
            rev(nums, 0, n - 1);
        } else {

            // find the just greater element that pivot and swap
            for (int i = n - 1; i >= pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }

            // now reverse so that we get closest one
            rev(nums, pivot + 1, n - 1);
        }

    }

    public void rev(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
