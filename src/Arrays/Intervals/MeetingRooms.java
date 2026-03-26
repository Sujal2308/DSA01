//!https://www.geeksforgeeks.org/problems/attend-all-meetings/1
public class MeetingRooms {
    static boolean canAttend(int[][] intervals) {
        // Sort intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Initialize start and end times of the first interval
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        // Check each subsequent interval for conflicts
        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            // If current interval starts before previous one ends, there's a conflict
            if (end1 - start2 > 0) {
                return false;
            }
            // Move to the next interval
            start1 = start2;
            end1 = end2;

        }

        // No conflicts found
        return true;

    }
}
