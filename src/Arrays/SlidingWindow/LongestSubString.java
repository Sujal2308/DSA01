class Solution {
    public int lengthOfLongestSubstring(String s) {
       int low = 0;
       int res = 0;
       int high = 0;
       HashSet<Character> set = new HashSet<>();
       for (; high < s.length(); high++) {
           char next = s.charAt(high);

           while (set.contains(next)) {
               res = Math.max(res, high -low);
               set.remove(s.charAt(low));
               low++;
           }

           set.add(next);
       }


       return Math.max(res,high-low);
}}
