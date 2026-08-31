// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int low = 0;
        int high = 0;
        int result = -1;
        HashSet<Character> set = new HashSet<>();

        while (high < s.length()) {
            while (set.contains(s.charAt(high))) {
                result = Math.max(result, high - low);
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            high++;
        }
        return result;
    }
}
