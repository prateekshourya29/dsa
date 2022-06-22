package solutions.recursion;

import java.util.Arrays;

public class SelectionSort {
  public static void sort(int[] arr, int row, int col, int max) {
    if (row == 1) return;

    if (col < row) {
      if (arr[col] > arr[max]) max = col;
      sort(arr, row, col + 1, max);
    } else {
      int temp = arr[row - 1];
      arr[row - 1] = arr[max];
      arr[max] = temp;
      sort(arr, row - 1, 0, 0);
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 4, 2, 1};
    sort(arr, arr.length, 0, 0);
    System.out.println(Arrays.toString(arr));
  }
}
