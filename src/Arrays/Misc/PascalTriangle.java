// Generate Pascal's Triangle
// Link: https://leetcode.com/problems/pascals-triangle/
package Arrays.Misc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp;
        for(int i = 1; i<=n; i++){
            temp = new ArrayList<>();
            int ans = 1;
            for(int j = 1; j<=i ; j++){
               ans = ans*(n-j);
               ans = ans/j;
               temp.add(ans);
            }
            list.add(temp);
        }

        return list;
}
