import java.util.ArrayList;
class Union{
  public static void main(String[] args){
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {1,2,3};
    System.out.println(union(arr1,arr2));
  }
static ArrayList<Integer> union(int[] nums1,int[] nums2){
    ArrayList<Integer> list = new ArrayList<>();
    addItems(list,nums1);
    addItems(list,nums2);
    return list;
  }
  static void addItems(ArrayList<Integer> list , int[] arr){
      for(int i = 0; i<arr.length ; i++){
          if(!list.contains(arr[i])){
              list.add(arr[i]);
          }
      }
  }
}