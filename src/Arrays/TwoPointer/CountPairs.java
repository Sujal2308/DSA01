//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class CountPairs {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int target = 5;
        System.out.println(countPairs(nums, target));
    }

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int pairs = 0;
        int low = 0;
        int high = nums.size() - 1;
        while (low < high) {
            int sum = nums.get(low) + nums.get(high);
            if (sum < target) {
                pairs = pairs + high - low;
                low++;
            } else {
                high--;
            }

        }
        return pairs;
    }
}
