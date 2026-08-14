//Leetcode link: https://leetcode.com/problems/next-greater-element-i/description/
package Stack;

public class NextGreater1 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] ans = nextGreaterElement(nums1, nums2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int el = nums2[i];
            int gt = -1;

            while (!stack.isEmpty() && stack.peek() < el) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                stack.push(el);
                map.put(el, gt);
            } else {
                map.put(el, stack.peek());
                stack.push(el);

            }
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;

    }
}