import java.util.Arrays;
class SelectionSort{
  public static void main(String[] args){
    int[] arr = {5,3,4,1,2};
    // Inplace sorting algorithm
    // time complexity = O(n^2)
    selectionSort(arr);
  }

  static void selectionSort(int[] arr){
    for(int i = 0 ; i<=arr.length-2 ; i++){
      int min = i;
      for(int j = i+1 ; j<=arr.length-1 ; j++){
        if(arr[j]<arr[min]){
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}