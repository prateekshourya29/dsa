package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProductOfThreeNumbers {
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length - 1;
    
    int first = nums[0];
    int second = nums[1];
    int last = nums[n];
    int s_last = nums[n - 1];
    int t_last = nums[n - 2];
    
    int product1 = first * second * last;
    int product2 = last * s_last * t_last;
    
    
    return Math.max(product1, product2);
  }
}
