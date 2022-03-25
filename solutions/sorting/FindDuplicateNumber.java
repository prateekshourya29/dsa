package solutions.sorting;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNumber {
  public int findDuplicate(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] != i + 1) {
        int cIdx = nums[i] - 1;
        if (nums[cIdx] != nums[i]) {
          int temp = nums[cIdx];
          nums[cIdx] = nums[i];
          nums[i] = temp;
        } else {
          return nums[i];
        }
      } else {
        i++;
      }
    }
    
    return -1;
  }
}
