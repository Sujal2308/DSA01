class CheckIfSorted{
  public static void main(String[] args){
    int[] arr = {1,3,4,2,4};
    boolean isSorted = isArraySorted(arr);
    System.out.print(isSorted);
  }
  static boolean isArraySorted(int[] arr){
    if(arr.length==1){
      return true;
    }
    for(int i = 1 ; i<arr.length ; i++){
      if(arr[i-1]>arr[i]){
        return false;
      }
    }
    return true;
  }
}