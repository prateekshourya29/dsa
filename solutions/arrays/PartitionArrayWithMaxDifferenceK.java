package solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/
public class PartitionArrayWithMaxDifferenceK {
  public static int partitionArray(int[] nums, int k) {
    Arrays.sort(nums);
    
    int count = 1;
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - min > k) {
        count++;
        min = nums[i];
      }
    }
    
    return count;
  }

  public static void main(String[] args) {
    int[] nums = {3,6,1,2,5};
    int k = 2;
    System.out.println(partitionArray(nums, k));
  }
}
