import java.util.ArrayList;

class RemoveDuplicates{
  public static void main(String[] a){
    int[] arr = {1,1,3,4,5,5,6,6,6,2};
    int uniqueItems = removeIdenticals(arr);
    System.out.println(uniqueItems);
  }

  static int removeIdenticals(int[] arr){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0 ; i<arr.length;i++){
      if(!list.contains(arr[i])){
        list.add(arr[i]);
      }
    }
    return list.size();
  }
}