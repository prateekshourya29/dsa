package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
public class CanMakeArithmeticProgressionFromSequence {
  public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    
    int diff = arr[1] - arr[0];
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] != diff) return false;
    }
    
    return true;
  }
}
