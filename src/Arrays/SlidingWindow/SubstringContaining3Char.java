// Leetcode 1358. Number of Substrings Containing All Three Characters
// Link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
package Arrays.SlidingWindow;

import java.util.HashMap;

public class SubstringContaining3Char {
    public int numberOfSubstrings(String s) {
        int low = 0;
        int high = 0;
        int cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (high < s.length()) {
            char c = s.charAt(high);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() == 3) {
                char left = s.charAt(low);
                cnt = cnt + s.length() - high;
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                low++;
            }

            high++;
        }

        return cnt;

    }
}
