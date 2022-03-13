package solutions.arrays;

// [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
public class NumberSmallerThanCurrentNumber {
  public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] arr = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
          int lower_num_count = 0;
          for(int j = 0; j < nums.length; j++) {
              if(nums[j] < nums[i]) lower_num_count++;
          }
          arr[i] = lower_num_count;
      }
      return arr;
  }
}
