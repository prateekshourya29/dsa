package solutions.sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  static void bubbleSort(int[] arr) {
    boolean swapped;

    for (int i = 0; i < arr.length; i++) {
      swapped = false;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j -1);
          swapped = true;
        }
      }
      if (!swapped) break;
    }
  }
}
