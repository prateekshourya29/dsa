package solutions.searching;

import java.util.HashSet;

// [Fair Candy Swap](https://leetcode.com/problems/fair-candy-swap/)
public class FairCandySwap {
  public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int sumA = 0;
    int sumB = 0;
    
    for(int x: aliceSizes) sumA += x;
    for(int x: bobSizes) sumB += x;
    
    int val = (sumB - sumA) / 2;
    
    HashSet<Integer> set = new HashSet<>();
    for(int x: bobSizes) set.add(x);
    
    for(int x: aliceSizes)
      if(set.contains(x + val)) 
        return new int[] {x, x + val};
    
    return new int[] {-1, -1};
  }
}
