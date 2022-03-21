package solutions.searching;

import java.util.HashSet;

// [Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/)
public class CheckIfNandItsDoubleExist {
  public boolean checkIfExist(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int zeroCount = 0;
    for(int x: arr) {
      if (x == 0) zeroCount++;
      set.add(x);
    }
    
    if (zeroCount > 1) return true;
    
    for(int x: arr)
      if (x != 0 && set.contains(2 * x))
        return true;
    
    return false;
  }
}
