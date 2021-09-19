package solutions.arrays.easy;

public class Ques03 {
  // [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
  public int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    int sum = 0;
    
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        ans[i] = sum;
    }
    
    return ans;
  }
}
