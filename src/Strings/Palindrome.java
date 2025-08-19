public class Palindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String str) {
    int low = 0;
    int high = str.length() - 1;
    str = str.toLowerCase();
    while (low < high) {
      if (str.charAt(low) < 'a' || str.charAt(low) > 'z') {
        low++;
        continue;
      } else if (str.charAt(high) < 'a' || str.charAt(high) > 'z') {
        high--;
        continue;
      }
      if (str.charAt(low) != str.charAt(high)) {
        return false;
      }
      low++;
      high--;
    }
    return true;
  }
}