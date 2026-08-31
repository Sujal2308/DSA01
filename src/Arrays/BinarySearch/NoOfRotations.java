// https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/ROTATIONARAY
package Arrays.BinarySearch;

public class NoOfRotations {
    public static void main(String[] args) {

    }

    public int countRotations(int[] nums) {
        // write your code here
        int low = 0;
        int high = nums.length - 1;
        int res = Integer.MAX_VALUE;
        int index = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= nums[low]) {
                if (nums[low] < res) {
                    res = nums[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (nums[mid] < res) {
                    res = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;

    }
}
