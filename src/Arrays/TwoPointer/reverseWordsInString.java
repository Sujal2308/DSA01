// link : https://leetcode.com/problems/reverse-words-in-a-string/
package Arrays.TwoPointer;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (s.charAt(low) == ' ') {
            low++;
        }

        while (s.charAt(high) == ' ') {
            high--;
        }

        // "a good example"
        StringBuilder str = new StringBuilder();
        int p1 = high;
        int p2 = high;
        while (p2 > low) {
            if (s.charAt(p2) != ' ' && s.charAt(p2 - 1) == ' ') {
                str.append(s, p2, p1 + 1);
                str.append(" ");
                p1 = p2 - 1;
                p2--;
                continue;
            }
            if (s.charAt(p2) == ' ' && s.charAt(p2 - 1) != ' ') {
                p1 = p2 - 1;
                p2--;
                continue;
            }
            p2--;
        }
        str.append(s, p2, p1 + 1);

        return str.toString();
    }
}
