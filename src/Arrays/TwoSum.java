class TwoSum{
  public static void main(String[] args){
    int[] arr = {2,7,11,15};
    int target = 6;
    int[] result = twoSum(arr,target);
    System.out.println(result[0]+" "+result[1]);
  }

  static int[] twoSum(int[] arr , int target){
    // Brute force approach
    // Time complexity : O(n^2)
    // Space complexity : O(1)
    int[] demoArr = new int[2];
    int sum = 0;
    for(int i = 0 ; i<arr.length ; i++){
      for(int j = i+1 ; j<arr.length ; j++){
        sum = arr[i] + arr[j];
        if(sum == target){
          demoArr[0] = i;
          demoArr[1] = j;
          return demoArr;
        }
      }
    }
  return new int[]{-1,-1};
  }
}