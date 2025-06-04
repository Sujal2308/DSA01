import java.util.*;

class MergeSort {
  public static void main(String[] args) {
    int[] arr = { 10, 3, 4, 2, -1, 0, 100 };
    MS(arr, 0, arr.length - 1);
  }

  static void MS(int[] arr, int low, int high) {
    int mid = (low + high) / 2;
    if (low >= high) {
      return;
    }
    MS(arr, low, mid);
    MS(arr, mid + 1, high);
    merge(arr, low, mid, high);

  }

  static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> list = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] >= arr[right]) {
        list.add(arr[right]);
        right++;
      } else {
        list.add(arr[left]);
        left++;
      }
    }

    while (left <= mid) {
      list.add(arr[left]);
      left++;
    }
    while (right <= high) {
      list.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = list.get(i - low);
    }
    System.out.println(Arrays.toString(arr));
  }
}