// Leetcode 350. Intersection of Two Arrays II
// Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/

package Arrays.Misc;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean b = nums1.length > nums2.length;

        if (b) {
            return m1(nums1, nums2);
        }

        return m1(nums2, nums1);
    }

    // generalize

    public int[] m1(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
