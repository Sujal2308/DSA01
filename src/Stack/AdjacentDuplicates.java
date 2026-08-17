// Leetcode 1047. Remove All Adjacent Duplicates In String
package Stack;

public class AdjacentDuplicates {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.reverse().toString();

    }

}
