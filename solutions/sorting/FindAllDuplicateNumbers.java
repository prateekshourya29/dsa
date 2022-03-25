package solutions.sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicateNumbers {
  public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> arr = new ArrayList<>();
    
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
        arr.add(nums[j]);
      }
    }
    
    return arr;
  }
}
