package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class HeightChecker {
  public int heightChecker(int[] heights) {
    int[] expected = heights.clone();
    Arrays.sort(expected);
    
    int count = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != expected[i]) count++;
    }
    
    return count;
  }
}
