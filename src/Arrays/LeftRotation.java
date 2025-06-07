import java.util.Arrays;

class LeftRotation{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int k = 4;
    
    System.out.println(Arrays.toString(leftRotate(arr,k)));
  }
  static int[] leftRotate(int[] arr,int k){
    int n = arr.length-1;
    if(k>arr.length){
      k = k % arr.length;
    }
    reverse(arr,0,k-1);
    reverse(arr,k,n);
    reverse(arr,0,n);
    return arr;
  }
  static void reverse(int[] arr , int l , int h){
    if(l<h){
      int mid = (l+h)/2;
      while(l<=mid){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
        l++;
        h--;
      }
    }
  
  }
}