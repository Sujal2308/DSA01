// Leetcode 2511. Maximum Enemy Forts That Can Be Captured
// lINK: https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/

//! CORE IDEA : count all no of 0's between 1 and -1 and vice versa and return the max count of 0's
package Arrays.TwoPointer;

public class CaptureForts {
    public int captureForts(int[] forts) {

        int low = 0;
        int high = 0;
        int res = 0;

        while (low < forts.length && !(forts[low] == 1 || forts[low] == -1)) {
            low++;
        }

        high = low + 1;

        while (high < forts.length) {

            if (forts[high] == -forts[low]) {
                res = Math.max(res, high - low - 1);
                low = high;
            }

            if (forts[low] == forts[high]) {
                low = high;
            }

            high++;
        }

        return res;

    }
}
