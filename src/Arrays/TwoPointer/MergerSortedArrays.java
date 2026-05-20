//https://leetcode.com/problems/merge-sorted-array/
public class MergerSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int p = m + n - 1;

        while (j >= 0 && i >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[p] = nums2[j];
                j--;
            } else {
                int temp = nums1[i];
                nums1[i] = nums1[p];
                nums1[p] = temp;
                i--;
            }
            p--;
        }
        while (j >= 0) {
            nums1[p] = nums2[j];
            j--;
            p--;
        }
    }
}
