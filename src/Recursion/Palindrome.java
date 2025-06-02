class Palindrome{
  public static void main(String[] args) {
  String s = "MADsAM";
  System.out.println(palindrome(s,0));
  }
  static boolean palindrome(String s ,int n){
  if(s.length()/2 == n){
      return true;
  }
  if(s.charAt(n) == s.charAt(s.length()-n-1)){
      return palindrome(s,n+1);
  }
  return false;
  }
}