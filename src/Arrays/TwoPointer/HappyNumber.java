// Link: https://leetcode.com/problems/happy-number/description/
class Solution {

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (fast != 1) {
            slow = sqsum(slow);
            fast = sqsum(fast);
            fast = sqsum(fast);

            if (slow == fast && slow != 1) {
                return false;
            }

        }
        return true;
    }

    public static int sqsum(int num) {
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum = sum + (last * last);
            num = num / 10;
        }
        return sum;
    }
}