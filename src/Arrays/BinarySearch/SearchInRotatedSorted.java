class RotatedSorted{
  // Search in Rotated Sorted Array
  // Time Complexity : O(logn)
  // Space Complexity : O(1)
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
  static int search(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;
      while (low <= high) {
          int mid = (low + high) / 2;

          if (nums[mid] == target) {
              return mid;
          }

          if (nums[mid] >= nums[low]) {
              //? left part is sorted
              if (target >= nums[low] && target <= nums[mid]) {
                  high = mid - 1;
              } else {
                  low = mid + 1;
              }
          } else if (nums[mid] <= nums[high]) {
              //? right part is sorted
              if (target >= nums[mid] && target <= nums[high]) {
                  low = mid + 1;
              } else {
                  high = mid - 1;
              }
          }
      }
      return -1;
  }
}