package solutions.arrays.easy;

public class Ques24 {
  // [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

  // “Kadane Algorithm”. Also there’s one simple trick. Reinitialize sum to 0 when it’s less than 0. 
  // It will also work for -ve numbers as we’ll take max as most min value and only one number will be returned 
  // if all are -ve because sum of two -ve number will never be greater.

  class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max_sum = Math.max(sum, max_sum);
            if (sum < 0) sum = 0;
        }
        
        return max_sum;
    }
  }
}
