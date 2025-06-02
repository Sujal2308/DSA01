import java.util.Arrays;
class ReverseOfArray{
  public static void main(String[] args) {
  int[] arr = {1,2,3,4,5,6,7};
  revArr(arr,arr.length);
  }
  static void revArr(int[] arr , int n){
      int len = arr.length;
      if(arr.length/2 == n){
          System.out.println(Arrays.toString(arr));
          return;
      }
     swap(arr,n , len);
      revArr(arr,n-1);
  }
  static void swap(int[] arr , int n , int len){
    int temp = arr[len-n];
      arr[len-n] = arr[n-1];
      arr[n-1] = temp;
  }
}