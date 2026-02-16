class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        while(mid <= high ){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
          else{
            mid++;
          }
        }
 }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
