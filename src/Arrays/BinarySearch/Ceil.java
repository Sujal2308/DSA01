class Ceil{
  // Ceil is the smallest element in the array which is greater than or equal to the target element.

  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,7,8,9,10};
    System.out.println(ceil(arr,7));
  }


  static int ceil(int[] arr , int target){
    int low = 0;
    int high = arr.length-1;
    int ceilVal = arr.length;
    while(low<=high){
      int mid = (low+high)/2;
      if(arr[mid]>=target){
        ceilVal = arr[mid];
        high = mid -1;
      }else{
        low = mid +1;
      }
    }
    return ceilVal;
  }
}