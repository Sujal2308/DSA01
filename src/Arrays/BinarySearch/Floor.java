class Floor{
  // Floor is the largest element in the array which is less than or equal to the target element.
  // Same as lowerBound
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(floor(arr, 0));
  }
  static int floor(int[] arr , int target){
    int low = 0;
    int high = arr.length-1;
    int floorVal = -1;
    while(low<=high){
      int mid = (low+high)/2;
      if(arr[mid]<=target){
        floorVal = arr[mid];
        low = mid+1; 
      }else{
        high = mid - 1;
      }
    }
    return floorVal;
  }
}