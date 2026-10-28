// LeetCode problem: https://leetcode.com/problems/subsets/
package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        return SS(nums, 0, new ArrayList<>(), new ArrayList<>());
    }

    public List<List<Integer>> SS(int[] arr, int i, List<List<Integer>> list, ArrayList<Integer> temp) {

        if (i == arr.length) {
            list.add(new ArrayList<>(temp));
            return list;
        }
        temp.add(arr[i]);
        SS(arr, i + 1, list, temp);
        temp.remove(temp.size() - 1);
        SS(arr, i + 1, list, temp);
        return list;
    }
}
