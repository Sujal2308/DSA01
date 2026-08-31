// Leetcode link: https://leetcode.com/problems/next-greater-element-ii/description/
package Stack;

public class NextGreater2 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(ans, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {
            int el = nums[i % n];

            while (!stack.isEmpty() && stack.peek() <= el) {
                stack.pop();
            }

            if (i < n && !stack.isEmpty()) {
                ans[i] = stack.peek();
            }

            stack.push(el);
        }

        return ans;
    }
}
