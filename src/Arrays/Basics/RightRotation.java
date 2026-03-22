import java.util.Arrays;

class RightRotation{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int k = 6;

    System.out.println(Arrays.toString(rightRotate(arr,k)));
  }
  static int[] rightRotate(int[] arr,int k){
    int n = arr.length;
    if(k>arr.length){
      k = k % arr.length;
    }
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-k-1);
    reverse(arr,0,n-1);
    return arr;
  }
  static void reverse(int[] arr , int l , int h){
      while(l<h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
        l++;
        h--;
      }
    }

}