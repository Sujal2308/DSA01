// LeetCode problem: https://leetcode.com/problems/combination-sum/
package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return CS(candidates, 0, 0, new ArrayList<>(), new ArrayList<>(), target);
    }

    public List<List<Integer>> CS(int[] arr, int i, int sum, List<List<Integer>> temp, ArrayList<Integer> list,
            int target) {
        if (sum == target) {
            temp.add(new ArrayList<>(list));
            return temp;
        }
        if (sum > target) {
            return temp;
        }
        if (i == arr.length) {
            return temp;
        }
        sum += arr[i];
        list.add(arr[i]);
        CS(arr, i, sum, temp, list, target);
        sum -= arr[i];
        list.remove(list.size() - 1);
        CS(arr, i + 1, sum, temp, list, target);
        return temp;
    }
}
