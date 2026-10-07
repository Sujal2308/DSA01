// LeetCode problem: 881. Boats to Save People
//  https://leetcode.com/problems/boats-to-save-people/
package Arrays.TwoPointer;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low = 0;
        int high = people.length - 1;
        int cnt = 0;

        while (people[high] == limit) {
            cnt++;
            high--;
        }
        while (low <= high) {
            int sum = people[low] + people[high];

            if (low == high) {
                cnt++;
                break;
            }

            if (sum > limit) {
                cnt++;
                high--;
            } else {
                cnt++;
                low++;
                high--;
            }
        }

        return cnt;
    }
}
