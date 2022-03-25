package solutions.sorting;

// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
  public int[] findErrorNums(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int cIdx = nums[i] - 1;
      if (nums[cIdx] != nums[i]) {
        int temp = nums[cIdx];
        nums[cIdx] = nums[i];
        nums[i] = temp;
      } else {
        i++;
      }
    }
    
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j + 1) {
        return new int[] {nums[j], j + 1};
      }
    }
    
    return new int[] {-1, -1};
  }
}
