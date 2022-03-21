package solutions.sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  static int findMax(int[] arr, int end) {
    int max = 0;
    for (int j = 1; j <= end; j++) {
      if (arr[j] > arr[max]) {
        max = j;
      }
    }

    return max;
  }

  static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int last = arr.length - i - 1;
      int maxIdx = findMax(arr, last);
      swap(arr, maxIdx, last);
    }
  }
}
