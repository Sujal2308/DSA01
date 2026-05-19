public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        // 0,1,9,16,100
        int[] result = sortedSquares(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortedSquares(int[] arr) {
        int[] nums = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        int i = 0;
        while (low < high) {
            if (Math.abs(low) < Math.abs(high)) {
                nums[arr.length - 1 - i] = arr[high] * arr[high];
                high--;
            } else {
                nums[arr.length - 1 - i] = arr[low] * arr[low];
                low++;
            }

            i++;

        }
        return nums;
    }
}