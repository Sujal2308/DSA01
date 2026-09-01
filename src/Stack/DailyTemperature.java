// Link: https://leetcode.com/problems/daily-temperatures/

// desc: Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
package Stack;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];

        // nge - montonic stack app
        Stack<Integer> stack = new Stack<>();

        for (int i = temp.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }

            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;

            stack.push(i);
        }

        return res;
    }
}
