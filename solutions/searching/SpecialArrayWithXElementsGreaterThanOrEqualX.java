package solutions.searching;

import java.util.Arrays;

// [Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)
public class SpecialArrayWithXElementsGreaterThanOrEqualX {
  public int specialArray(int[] nums) {
    Arrays.sort(nums);
    
    for (int i = nums.length; i > 0; i--) {
      int start = 0, end = nums.length - 1;
      
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] >= i) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      
      if ((nums.length - start) == i) return i;
    }
    
    return -1;
  }
}
