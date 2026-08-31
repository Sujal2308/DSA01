// Link : https://www.geeksforgeeks.org/previous-smaller-element/
package Stack;

public class PrevSmaller {

    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int res = -1;

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                list.add(-1);
                stack.push(arr[i]);
                continue;
            }

            list.add(stack.peek());
            stack.push(arr[i]);

        }
        return list;
    }

}
