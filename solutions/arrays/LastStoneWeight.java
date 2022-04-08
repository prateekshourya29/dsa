package solutions.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {
  public int lastStoneWeight(int[] stones) {
    int n = stones.length - 1;
    
    for (int i = n - 1; i >= 0; i--) {
      Arrays.sort(stones);
      int x = stones[i];
      int y = stones[i + 1];
      
      if (x == y) {
        stones[i] = 0;
      } else {
        stones[i] = y - x;
      }
    }
    
    return stones[0];
  }
}
