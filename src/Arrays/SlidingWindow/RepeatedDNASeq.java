import java.util.*;

public class RepeatedDNASeq {
    public static void main(String[] args) {

    }

    public static List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> visited = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        int low = 0;
        int high = 9;

        while (high < s.length()) {

            if (!visited.contains(s.substring(low, high + 1))) {
                visited.add(s.substring(low, high + 1));
            } else {
                set.add(s.substring(low, high + 1));
            }

            low++;
            high++;

        }

        return new ArrayList<>(set);

    }

}
