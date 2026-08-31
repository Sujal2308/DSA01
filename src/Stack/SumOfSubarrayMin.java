// Leetcode 907. Sum of Subarray Minimums
// LINK: https://leetcode.com/problems/sum-of-subarray-minimums/
package Stack;

public class SumOfSubarrayMin {
    public int sumSubarrayMins(int[] arr) {
        // Find NSE
        // FIND PSEE
        long total = 0;
        int[] NSE = nse(arr);
        int[] PSEE = psee(arr);
        int mod = ((int) Math.pow(10, 9) + 7);
        for (int i = 0; i < arr.length; i++) {
            int left = i - PSEE[i];
            int right = NSE[i] - i;
            total = (total + ((long) left * right * arr[i]) % mod) % mod;
        }
        return (int) total;
    }

    public int[] nse(int[] arr) {
        int[] nums = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        int res = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            nums[i] = stack.isEmpty() ? res : stack.peek();

            stack.push(i);
        }

        return nums;
    }

    public int[] psee(int[] arr) {
        int[] nums = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            nums[i] = stack.isEmpty() ? res : stack.peek();

            stack.push(i);
        }

        return nums;
    }
}
