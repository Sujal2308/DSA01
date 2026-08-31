// Link: https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;

        while (i < nums.length) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
            i++;
        }
        return false;
    }
}