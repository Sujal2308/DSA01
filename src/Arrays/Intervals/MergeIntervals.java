public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // Sort intervals by their start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // List to store merged intervals
        ArrayList<int[]> list = new ArrayList<>();

        // Initialize with the first interval
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        // Iterate through remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            // Check if current interval overlaps with the previous one
            if (end1 >= start2) {
                // Merge by extending the boundaries
                start1 = Math.min(start1, start2);
                end1 = Math.max(end1, end2);
            } else {
                // No overlap: add previous interval to result and start a new one
                list.add(new int[] { start1, end1 });
                start1 = start2;
                end1 = end2;
            }
        }

        // Add the last merged interval
        list.add(new int[] { start1, end1 });

        // Convert ArrayList to 2D array and return
        return list.toArray(new int[list.size()][]);
    }
}
