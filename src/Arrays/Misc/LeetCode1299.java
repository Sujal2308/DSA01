class ReplaceItems{
  // https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

  // same as FindLeaders.java but last item is -1 and not added to the list rather added to the array directly
  public static void main(String[] a){
    int[] arr = {17,18,5,4,6,1};
    System.out.println(replaceElements(arr));
  }
  static int[] replaceElements(int[] arr) {
      // Time Complexity O(n)
      // Space Complexity O(n)
      int[] newArr = new int[arr.length];
      int len = arr.length;
      int max = Integer.MIN_VALUE;
      for (int i = len - 1; i >0; i--) {

          if (arr[i] > max) {
              max = arr[i];

          }
          newArr[i-1] = max;

      }
      newArr[len - 1] = -1; // last item always be -1;
      return newArr;
  }
}