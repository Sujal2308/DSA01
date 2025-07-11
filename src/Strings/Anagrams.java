import java.util.*;
class Anagrams{
  // Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1,s2));
    }
  public static boolean isAnagram(String s, String t) {
      //Time Complexity: O(nlogn)
      //Space Complexity: O(n)
      char[] c = s.toCharArray();
      char[] c2 = t.toCharArray();
      if (c.length != c2.length) {
          return false;
      }
      Arrays.sort(c);
      Arrays.sort(c2);
      StringBuilder str1 = new StringBuilder("");
      StringBuilder str2 = new StringBuilder("");

      for (int i = 0; i < c.length; i++) {
          str1.append(c[i]);
          str2.append(c2[i]);
      }

      return str1.toString().equals(str2.toString());
  }
}