package solutions.sorting;

// https://leetcode.com/problems/sort-array-by-parity/
public class SortArrayByParity {
  public int[] sortArrayByParity(int[] arr) {
    int i = 0, j = 0;
    while (j < arr.length) {
      if (arr[i] % 2 == 0) {
        i++;
        j++;
      } else if (arr[j] % 2 == 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      } else {
        j++;
      }
    }
    
    return arr;
  }
}
