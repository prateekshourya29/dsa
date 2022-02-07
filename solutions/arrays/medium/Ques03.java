package solutions.arrays.medium;

public class Ques03 {
  // [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
  class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] arr = new int[n];
      
      int product = 1;
      for (int i = 0; i < n; i++) {
        arr[i] = product;
        product *= nums[i];
      }
      
      product = 1;
      for (int i = n-1; i >= 0; i--) {
        arr[i] *= product;
        product *= nums[i];
      }
      
      return arr;
    }
  }
}