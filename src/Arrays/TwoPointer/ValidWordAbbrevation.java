public class ValidWordAbbrevation {
    public static void main(String[] args) {
        // /Input: word = "international", abbr = "i9l"
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            int digit = 0;
            while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                digit = digit * 10 + Integer.parseInt(abbr.charAt(j));
                j++;
            }

            while (digit > 0) {
                i++;
                digit--;
            }

            if (i < word.length() && j < abbr.length() && word.charAt(i) != abbr.charAt(j)) {
                return false;
            }

            i++;
            j++;

        }
    }
}
