package solutions.sorting;

import java.util.*;

// https://leetcode.com/problems/minimum-absolute-difference/
public class MinimumAbsoluteDifference {
  public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    int min_diff = Integer.MAX_VALUE;
    
    // Sort the array and find out the minimum absolute difference.
    for (int i = 0; i < arr.length - 1; i++) {
      int diff = arr[i + 1] - arr[i];
      if (diff < min_diff) {
        min_diff = diff;
      }
    }
    
    // Again iterate over the array and add all the values having minimum absolute difference.
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - arr[i] == min_diff) {
        list.add(Arrays.asList(arr[i], arr[i + 1]));
      }
    }
    
    return list;
  }
}
