//Leetcode link: https://leetcode.com/problems/valid-parentheses/description/
public class ValidParenthisis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                char top = !stack.isEmpty() ? stack.peek() : 'a';
                if (top != 'a' &&
                        (top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
