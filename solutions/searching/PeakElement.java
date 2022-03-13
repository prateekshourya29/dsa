package solutions.searching;

// https://leetcode.com/problems/find-peak-element/
public class PeakElement {
  public int findPeakElement(int[] arr) {
    int n = arr.length - 1;
    int start = 0, end = n - 1;
    
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return start;
  }
}
