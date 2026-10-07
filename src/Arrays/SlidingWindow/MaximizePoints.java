// Maximize Points by Picking Cards
// Link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

// Circular Array logic
package Arrays.SlidingWindow;

public class MaximizePoints {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int i = n - k;
        int j = n;
        int sum = 0;
        int res = 0;
        for (int p = i; p < j; p++) {
            sum += cardPoints[p];
        }

        res = Math.max(res, sum);

        if (j - i == n)
            return res;

        while (j % n < k) {
            sum = sum + cardPoints[j % n] - cardPoints[i];
            res = Math.max(res, sum);
            i++;
            j++;
        }

        return res;
    }
}
