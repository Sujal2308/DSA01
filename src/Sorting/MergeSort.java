package Sorting;

import java.util.*;

class MergeSort {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 4, 2, 5, 0 };
    divide(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  static void divide(int[] arr, int low, int high) {
    // 0 1 2 3
    if (low >= high) {
      return;
    }
    int mid = (low + high) / 2;
    divide(arr, low, mid);
    divide(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    ArrayList<Integer> temp = new ArrayList<>();
    while (i <= mid && j <= high) {
      if (arr[i] <= arr[j]) {
        temp.add(arr[i]);
        i++;
      } else {
        temp.add(arr[j]);
        j++;
      }
    }

    while (i <= mid) {
      temp.add(arr[i]);
      i++;
    }
    while (j <= high) {
      temp.add(arr[j]);
      j++;
    }

    for (int k = 0; k < temp.size(); k++) {
      arr[low] = temp.get(k);
      low++;
    }

  }
}