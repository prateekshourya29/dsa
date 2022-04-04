package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/rank-transform-of-an-array/
public class RankTransformArray {
  public int[] arrayRankTransform(int[] arr) {
    if (arr.length == 0) return new int[] {};
    
    // Copy the elements to another array and sort the orignal array.
    int[] ar = arr.clone();
    Arrays.sort(arr);
    
    // Now copy the elements of the sorted array to another array while removing the duplicates.
    int[] nums = new int[arr.length];
    int n = 1;
    nums[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        nums[n++] = arr[i];
      }
    }
    
    // Now search for every element in the nums array according to the orignal array and add its range to ans array.
    // Range = index of that element + 1. Since the array is sorted and doesn't contains any duplicate values.
    int[] ans = new int[arr.length];
    int i = 0;
    for (int a: ar) {
      int start = 0;
      int end = n - 1;
      
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == a) {
          ans[i++] = mid + 1;
          break;
        } else if (nums[mid] > a) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    
    return ans;
  }
}
