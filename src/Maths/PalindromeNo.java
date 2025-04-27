class PalindromeNo{
  public static void main(String[] args){
    int num = 1;
    System.out.println(isPalindrome(num));
  }
  static boolean isPalindrome(int num){
    if(num<0){
      return false;
    }
    int original=num;
    int reverse = 0;
    while(num>0){
      int lastDigit = num %10;
      reverse = reverse * 10 + lastDigit;
      num = num/10;
    }
    return original == reverse;
  }
}