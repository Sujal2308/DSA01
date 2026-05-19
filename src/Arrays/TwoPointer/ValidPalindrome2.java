public class ValidPalindrome2 {
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(validPalindrome(str));
    }

    public static boolean validPalindrome(String str) {

        int low = 0;
        int high = 0;

        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return isPalindrome(str, low + 1, high) || isPalindrome(str, low, high - 1);
            }

            low++;
            high--;
        }
        return true;
    }

    public static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

}
