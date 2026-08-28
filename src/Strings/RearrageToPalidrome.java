// link : hackerrank.com/challenges/game-of-thrones/problem

//! Note : A string can only be made palindrome if at most one character has an odd frequency. If more than one character has an odd frequency, it is impossible to rearrange the string into a palindrome.
package Strings;

public class RearrageToPalidrome {
    public static void main(String[] args) {
        System.out.println(pal("abab"));
    }

    public static boolean pal(String s) {
        // abab abcbcaa abbcda
        HashMap<Character, Integer> map = new HashMap<>();

        // 1. Store characters with their frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 2. Count characters with odd frequency
        int count = 0;

        for (int freq : map.values()) {
            if (freq % 2 != 0) {
                count++;
            }
        }

        // 3. More than one odd frequency → impossible
        return count <= 1;
    }
}