package solutions.sorting;

// https://leetcode.com/problems/first-missing-positive/
public class FindMissingPositive {
  public int firstMissingPositive(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int cIdx = nums[i] - 1;
      if (cIdx >= 0 && cIdx < nums.length && nums[cIdx] != nums[i]) {
        int temp = nums[cIdx];
        nums[cIdx] = nums[i];
        nums[i] = temp;
      } else {
        i++;
      }
    }
    
    for (i = 0; i < nums.length; i++) {
      if (nums[i] - 1 != i) {
        return i + 1;
      }
    }
    
    return i + 1;
  }
}
