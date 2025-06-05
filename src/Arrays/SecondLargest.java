import java.sql.Array;

class SecondLargest {
  public static void main(String[] args) {
    int[] arr = { -1,-2};
    int secondhighest = SL(arr);
    System.out.println(secondhighest);
  }

  static int SL(int[] arr){
    if(arr.length == 1){
      return arr[0];
    }
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for(int i = 0 ;i <arr.length ; i++){
      if(arr[i]>largest){
        secondLargest = largest;
        largest = arr[i];
      }
      else if(arr[i]<largest && arr[i]>secondLargest){
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }
}