package solutions.sorting;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {
  public int missingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctIndex = arr[i];
      if (correctIndex != arr.length && arr[i] != arr[correctIndex]) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      } else {
        i++;
      }
    }
    
    for (i = 0; i < arr.length; i++) {
      if (arr[i] != i) {
        return i;
      }
    }
    
    return i;
  }
}
