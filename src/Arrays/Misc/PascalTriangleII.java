// Generate Pascal's Triangle II
// Link: https://leetcode.com/problems/pascals-triangle-ii/
package Arrays.Misc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int row) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= row; i++) {
            long ans = fact(row, i);
            list.add((int) ans);
        }

        return list;
    }

    public long fact(int row, int col) {
        long res = 1;
        for (int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);

        }

        return res;
    }
}
