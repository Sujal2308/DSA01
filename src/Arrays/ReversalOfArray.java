import java.util.Arrays;

class ReversalOfArray{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8};
    reverseArray(arr);
  }
  static void reverseArray(int[] arr){
    // Reverse the array in place
    // Time complexity : O(n)
    // Space complexity : O(1) no extra space used
    int start = 0;
    int end = arr.length-1;
    int mid = (start+end)/2;
    for(int i = 0 ; i<=mid ; i++){
      int temp = arr[i];
      arr[i] = arr[end];
      arr[end] = temp;
      end--;
    }
    System.out.println(Arrays.toString(arr));
  }
}