class ConsecutiveOnes{
  public static void main(String[] a){
    int[] arr = {1};
    
    System.out.println(adjacentOnes(arr));
  }
  static int adjacentOnes(int[] arr){
    int max = Integer.MIN_VALUE;
    int count = 0;
    for(int i = 0 ; i<arr.length ; i++){
      if(arr[i]==1){
        count++;
      }else{
        if(count>max){
          max = count;
          count = 0;
        }
      }
    }
    if(count>max){
      max = count;
    }
    return max;
  }
}