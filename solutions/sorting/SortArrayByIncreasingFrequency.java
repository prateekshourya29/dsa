package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class SortArrayByIncreasingFrequency {
  public int[] frequencySort(int[] nums) {
    Arrays.sort(nums);
    
    int[][] arr = new int[nums.length][2];
    int j = 0;
    arr[j][0] = nums[0];
    arr[j][1] = 1;
    
    // Add the number and it's frequency to arr.
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        j++;
        arr[j][0] = nums[i];
      }
        
      arr[j][1] += 1;
    }
    
    if (arr[j][1] == 0) j -= 1;
    
    // Sort the array by using custom comparator.
    // Element with lower freq will be returned. If both the element has same freq then greater number is returned.
    Arrays.sort(arr, 0, j + 1, (a, b) -> {
      int freq = a[1] - b[1];
      
      if (freq > 0) return 1;
      else if (freq < 0) return -1;
      else return b[0] - a[0];
    });
    
    // Now add all the number to a new array where each number occurance is it's frequency times.
    int[] ans = new int[nums.length];
    int i = 0;
    for(int k = 0; k <= j; k++) {
      while (arr[k][1]-- > 0) {
        ans[i++] = arr[k][0];
      }
    }
    
    return ans;
  }
}
