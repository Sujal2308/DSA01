import java.util.ArrayList;

class RemoveDuplicates{
  public static void main(String[] a){
    // CONDITION : Array must be sorted with duplicate items
    int[] arr = {1,1,3,4,5,5,6};
    int uniqueItems = removeIdenticals(arr);
    System.out.println(uniqueItems);
  }

  static int removeIdenticals(int[] arr){
    int i = 0;
    for(int j = i+1 ; j<arr.length ; j++){
      if(arr[i]!= arr[j]){
        arr[i+1] = arr[j];
        i++;
      }
    }
    return i+1;
  }
}