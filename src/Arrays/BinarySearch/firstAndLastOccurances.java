import java.util.Arrays;
class firstAndLastOccurances{
  public static void main(String[] args){
    int[] arr =  {1,2,3,3,3,3,4,5,6,7,8,9};
    int target = 3;
    System.out.println(Arrays.toString(firstAndLastOccurance(arr,target)));
  }
  static int[] firstAndLastOccurance(int[] arr , int target){
    int firstOcc = -1;
    int lastOcc = -1;
    for(int  i = 0 ; i<arr.length ; i++){
      if(arr[i]==target){
        if(firstOcc==-1){
          firstOcc = i;
        }
        lastOcc = i;
      }
    }
    return new int[]{firstOcc , lastOcc};
  }
}