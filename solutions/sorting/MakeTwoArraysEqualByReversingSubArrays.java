package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
// Can also be done by using HashMap.
public class MakeTwoArraysEqualByReversingSubArrays {
  public boolean canBeEqual(int[] target, int[] arr) {
    Arrays.sort(target);
    Arrays.sort(arr);
    
    return Arrays.equals(arr, target);
  }
}
