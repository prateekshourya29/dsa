package solutions.arrays;

// [Rotate Array](https://leetcode.com/problems/rotate-array/)
public class RotateArray {
  public void rotate(int[] nums, int k) {
    int n = nums.length;  
    int[] arr = nums.clone();
    int index = 0;
    
    if (k > n) k = k % n;
    
    for (int i = n - k; i < n; i++) {
      nums[index] = arr[i];
      index++;
    }
    
    for (int i = 0; i < n - k; i++) {
      nums[index] = arr[i];
      index++;
    }
    
  }
}
