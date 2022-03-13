package solutions.searching;

// [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
public class TwoSum2 {
  // Using Binary Search
  public static int[] twoSumBinarySearchMethod(int[] numbers, int target) {
    int n = numbers.length; 
    
    for (int i = 0; i < n; i++) {
      int diff = target - numbers[i];
      
      int start = i + 1;
      int end = n - 1;
      
      while (start <= end) {
        int mid = start + (end - start) / 2;
        
        if (numbers[mid] == diff) return new int[] {i + 1, mid + 1};
        else if (numbers[mid] > diff) end = mid - 1;
        else start = mid + 1;
      }
    }
    
    return new int[] {-1, -1};
  }

  // Better Approach: Using Two Pointers
  public int[] twoSumTwoPointer(int[] numbers, int target) {
    int n = numbers.length; 
    int start = 0;
    int end = n - 1;
    
    while (start < end) {
      int sum = numbers[start] + numbers[end];
      
      if (sum == target) break;
      else if (sum > target) end--;
      else start++;
    }
    
    return new int[] {start + 1, end + 1};
  }
}
