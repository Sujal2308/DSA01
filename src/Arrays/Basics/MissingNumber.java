class MissingNumber{
  public static void main(String[] args){
    int[] arr = {0,1,3,4,5};
    int missingNumber = findMissingNumber(arr);
    System.out.println(missingNumber);
  }
  static int findMissingNumber(int[] arr){
    int n = arr.length;
    int sum1 = (n*(n+1))/2;
    int sum2 =0;
    for(int i =0 ; i<arr.length ; i++){
      sum2 = sum2 + arr[i];
    }
    return sum1-sum2;
  }
}