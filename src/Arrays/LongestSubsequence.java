import java.util.Arrays;

// A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements.
//

class LongestSubsequence{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8};
    
    System.out.println(longestSubseq(arr));
    }

  static int longestSubseq(int[] arr){
    //Time Complexity: O(nlogn)
    //Space Complexity: O(1)
    if(arr.length==0){
      return 0;
    }
    Arrays.sort(arr);
    int count = 1;
    int max = Integer.MIN_VALUE;

    for(int i =1 ; i<arr.length ; i++){
      if(arr[i]==arr[i-1]+1){
        count++;
      }
      else if(arr[i]==arr[i-1]){
        continue;
      }
      else{
        max = Math.max(max, count);
        count = 1;
      }
    }
    max = Math.max(count,max);
    return max;
  }
    
}