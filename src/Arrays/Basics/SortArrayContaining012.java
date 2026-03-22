import java.util.Arrays;
// Problem Description
/**
 * Sorts an array containing only 0s, 1s, and 2s in ascending order.
 * 
 * Approach:
 * - Count the number of 0s, 1s, and 2s.
 * - Overwrite the array based on the counts.
 * 
 * Time Complexity: O(n)
 * - First loop: Count the number of 0s, 1s, and 2s → O(n)
 * - Second and third loops: Overwrite the array → O(n)
 * - Total: O(n) + O(n) = O(n)
 * 
 * Space Complexity: O(1)
 * - No extra space is used except for a few integer counters.
 * - Sorting is done in-place.
  */

class SortArrayContaining012{
  public static void main(String[] args){
    int[] arr = {0,1,2,0,1,2,0,1,2,0,1,2,0,2};
    System.out.println(Arrays.toString(sortArray(arr)));
  }
  static int[] sortArray(int[] arr){
    int n = arr.length;
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    for(int i : arr){
      if(i==0) count0++;
      else if(i==1) count1++;
      else count2++;
    }
    for(int i = 0 ; i<count0 ; i++){
      arr[i] = 0;
    }
    for(int i = count0 ; i<count0+count1 ; i++){
      arr[i] = 1;
    }
    for(int i = count0+count1 ; i<n ; i++){
      arr[i] = 2;
    }
    return arr;
  }
}