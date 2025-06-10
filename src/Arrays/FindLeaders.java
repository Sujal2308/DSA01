import java.util.ArrayList;

class FindLeaders{
  public static void main(String[] a){
    int[] arr = {16,17,4,3,5,2};
   
    System.out.println( findLeaders(arr));
  }

  static ArrayList<Integer> findLeaders(int[] arr){
     int n = arr.length;
    ArrayList<Integer> list = new ArrayList<>();
   
    int max = Integer.MIN_VALUE;
    for(int i = n-1 ; i>=0 ; i--){
      if(arr[i]>max){
        max = arr[i];
        list.add(max);
      }
    }
    return list;
  }
}