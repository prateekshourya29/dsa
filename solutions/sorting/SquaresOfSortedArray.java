package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {
  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    
    Arrays.sort(nums);
    
    return nums;
  }
}
