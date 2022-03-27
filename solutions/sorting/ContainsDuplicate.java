package solutions.sorting;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
  public boolean containsDuplicateSorting(int[] nums) {
    Arrays.sort(nums);
    
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) return true;
    }
    
    return false;
  }

  public boolean containsDuplicateHashSet(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) return true;
      else set.add(nums[i]);
    }
    
    return false;
  }
}
