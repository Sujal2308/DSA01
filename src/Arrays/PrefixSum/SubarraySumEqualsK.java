// Link: https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefix = prefix + nums[i];
            if (map.containsKey(prefix - k)) {
                cnt += map.get(prefix - k);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);

        }

        return cnt;
    }
}
