import java.util.HashMap;

class StrobogrammaticNo {

    public static void main(String[] args) {
        System.out.println(isSbg("191"));
    }

    public static boolean isSbg(String n) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int low = 0;
        int high = n.length() - 1;

        while (low <= high) {
            if (!map.containsKey(n.charAt(high))) {
                return false;
            }
            char c = map.get(n.charAt(high));
            if (n.charAt(low) == c) {
                low++;
                high--;
            } else {
                return false;
            }
        }

        return true;

    }
}