import java.util.Arrays;

// SC : O(n)
// TC : O(n)
// the idea is to use two pointers one for even and one for odd
// the array will be rearranged in such a way that all positive numbers are at even indexes and all negative numbers are at odd indexes
// the array will have equal number of positive and negative numbers

class RearrangeItemsBySign{
  public static void main(String[] args){
    int[] arr = {3,1,-2,-5,2,4};
    System.out.println(Arrays.toString(arr));
  }

  public static int[] rearrangeArray(int[] nums) {

  int[] newArr = new int[nums.length];
  int even = 0;
  int odd = 1;

  for(int i = 0 ; i<nums.length ; i++){

      if(nums[i]>0){
          newArr[even] = nums[i];
          even+=2;
      }
      else {
          newArr[odd] = nums[i];
          odd+=2;
      }

  }
  return newArr;
  }
}