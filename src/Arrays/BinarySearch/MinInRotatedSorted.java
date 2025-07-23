class MinInRotatedSorted{
    public static void main(String[] args){
        int[] arr = {11,13,15,17};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums){
      int low = 0;
      int high = nums.length-1;
      int min = Integer.MAX_VALUE;
      while(low<=high){
        int mid = low + (high-low)/2;
        if(nums[mid]>=nums[low]){
          //left part is sorted;
          min = Math.min(min,nums[low]);
          low = mid + 1;
        }
        if(nums[mid]<=nums[high]){
          // right part is sorted
          min = Math.min(min,nums[mid]);
          high = mid -1;
        }
      }
      return min;
    }
}