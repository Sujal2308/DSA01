class LengthOfLastWord{
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  // The last word is the last string in the array that is not empty and does not contain any leading or trailing spaces.
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

  static int lengthOfLastWord(String s) {
      int len = 0;
      int newLen = 0;
      for(int  i = s.length()-1 ; i>=0 ; i--){
          if(s.charAt(i)==' '){
              len++;
          }else{
              break;
          }
      }

      for(int  j = s.length()-1-len ; j>=0 ; j--){
          if(s.charAt(j)!=' '){
            newLen++;
          }else{
              break;
          }

      }
      return newLen;
  }
}