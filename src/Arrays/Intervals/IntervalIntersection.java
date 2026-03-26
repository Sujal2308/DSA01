//! https://leetcode.com/problems/interval-list-intersections/
public class IntervalIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // List to store intersection intervals
        List<int[]> list = new ArrayList<>();

        // Two pointers to iterate through both lists
        int i = 0;
        int j = 0;

        // Traverse both arrays while pointers are within bounds
        while (i < firstList.length && j < secondList.length) {
            // Extract start and end points of current intervals
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];

            // Check if intervals overlap
            if (e1 >= s2 && e2 >= s1) {
                // Add intersection: max of starts and min of ends
                list.add(new int[] {
                        Math.max(s1, s2),
                        Math.min(e1, e2)
                });
            }

            // Move pointer of interval that ends first
            if (e1 < e2) {
                i++;
            } else {
                j++;
            }
        }

        // Convert list to 2D array and return
        return list.toArray(new int[list.size()][]);
    }
}
