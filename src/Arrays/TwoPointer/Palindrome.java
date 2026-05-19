//https://leetcode.com/problems/valid-palindrome/
public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        int low = 0;
        int high = str.length() - 1;

        while (low < high) {
            boolean validCh1 = Character.isLetterOrDigit(str.charAt(low));
            boolean validCh2 = Character.isLetterOrDigit(str.charAt(high));

            if (!validCh1) {
                low++;
                continue;
            }

            if (!validCh2) {
                high--;
                continue;
            }

            if (Character.toLowerCase(str.charAt(low)) != Character.toUpperCase(str.charAt(high))) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }

}
