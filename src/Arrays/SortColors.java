class SortColors{

  // Sort Colors
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  // Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }
    public static void sortColors(int[] nums){
      int counter = 0;

      // sort 0's
      for(int i =0; i<nums.length ; i++){
          if(nums[i]==0){
              int temp = nums[counter];
              nums[counter] = nums[i];
              nums[i] =temp;
              counter++;
          }
      }
      //sort 1's
      for(int j = 0 ; j<nums.length ; j++){
          if(nums[j]==1){
              int temp = nums[counter];
              nums[counter] = nums[j];
              nums[j] =temp;
              counter++;
          }
      }
      // sort 2's
      for(int k = 0; k<nums.length ; k++){
          if(counter< nums.length-1 && nums[k]==2){
              int temp = nums[counter];
              nums[counter] = nums[k];
              nums[k] =temp;
              counter++;
          }
      }
      System.out.println(Arrays.toString(nums));
    }
}