class LowerBound{
  // Lower Bound is the first index of the element in the array which is greater than or equal to the target element.
  public static void main(String[] args){
    int[] arr = {1,2,2,3};
    System.out.println(lowerBound(arr, 2));
  }

  public static int lowerBound(int[] arr , int target){
    int low = 0;
    int high = arr.length-1;
    int ans = arr.length;
    while(low<high){
      int mid = (low+high)/2;
      if(arr[mid]>=target){
        ans = mid;
        high = mid -1;
      }
      else{
        low = mid +1;
      }
    }
    return ans;
  }
}