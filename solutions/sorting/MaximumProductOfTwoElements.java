package solutions.sorting;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// Can also be done by sorting the array and taking the last two elements but that's O(NlogN) complexity.
public class MaximumProductOfTwoElements {
  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE;
    int s_max = Integer.MIN_VALUE;
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        s_max = max;
        max = nums[i];
      } else if (nums[i] > s_max) {
        s_max = nums[i];
      }
    }
    
    return (max - 1) * (s_max - 1);
  }
}
