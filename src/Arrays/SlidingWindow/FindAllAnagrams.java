// link : https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        if (p.length() > s.length()) {
            return list;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < p.length(); i++) {
            arr1[p.charAt(i) - 'a']++;
        }

        int low = 0;
        int high = p.length();

        for (int i = low; i < high; i++) {
            arr2[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr1, arr2)) {
            list.add(low);
        }

        while (high < s.length()) {
            arr2[s.charAt(low) - 'a']--;
            arr2[s.charAt(high) - 'a']++;

            if (Arrays.equals(arr1, arr2)) {
                list.add(low + 1);
            }

            low++;
            high++;
        }

        return list;
    }
}
