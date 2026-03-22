import java.util.Arrays;

class SingleNumber {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int singleNumber = findSingleNumber(arr);
    System.out.println(singleNumber);
  }

  static int findSingleNumber(int[] arr) {
    int item = 0;
    int j = 1;
    Arrays.sort(arr);

    while (j < arr.length) {
      if (arr[j] == arr[j - 1]) {
        j++;
        item = j;
      } else {
        return arr[j - 1];
      }
      j++;
    }

    return arr[item];
  }

}