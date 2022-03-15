package solutions.searching;

// [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)
public class KthMissingPositiveNumber {
  public int findKthPositive(int[] arr, int k) {
    int n = arr.length;
    int prev = 0;
    int sum = 0;
    
    for (int num: arr) {
      sum += (num - prev - 1);
      prev = num;
      
      if (sum >= k) {
        return num - sum + k - 1;
      }
    }
    
    return arr[n - 1] - sum + k;
  }
}
