package solutions.sorting;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/relative-sort-array/
public class RelativeSortArray {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    HashSet<Integer> set = new HashSet<>();
    
    for (int a: arr2) set.add(a);
    
    int count = 0;
    for (int a: arr1) {
      if (set.contains(a)) count++;
    }
    
    int idx = count;
    
    int[] ans = new int[arr1.length];
    int i = 0;
    
    for (int a: arr2) {
      for (int b: arr1) {
        if (a == b) {
          ans[i++] = b;
        }
      }
    }
    
    for (int a: arr1) {
      if (!set.contains(a)) {
        ans[count++] = a;
      }
    }
    int n = ans.length;
    if (n > idx) {
      Arrays.sort(ans, idx, n); 
    }
    
    return ans;
  }
}
