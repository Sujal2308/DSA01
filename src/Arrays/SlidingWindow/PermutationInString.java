package Arrays.SlidingWindow;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }

        int low = 0;
        int high = s1.length();

        for (int i = low; i < high; i++) {
            arr2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }

        while (high < s2.length()) {
            arr2[s2.charAt(low) - 'a']--;
            arr2[s2.charAt(high) - 'a']++;

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }

            low++;
            high++;
        }

        return false;
    }
}
