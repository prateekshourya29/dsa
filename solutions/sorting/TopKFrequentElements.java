package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
  public int[] topKFrequent(int[] nums, int k) {
    Arrays.sort(nums);

    // Add all the values in another array which has 2 cols one for the numebr and other for its frequency.
    int[][] arr = new int[nums.length][2];
    int j = 0;
    arr[j][0] = nums[0];
    arr[j][1] = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        j++;
        arr[j][0] = nums[i];
      }

      arr[j][1] += 1;
    }

    if (arr[j][1] == 0) j -= 1;

    // Sort the array based on it's frequency by using custom comparator.
    Arrays.sort(arr, 0, j + 1, (a, b) -> {
      int freq = a[1] - b[1];

      if (freq > 0) return -1;
      else if (freq < 0) return 1;
      else return a[0] - b[0];
    });
    
    // Add K values to another array from the sorted frequency array and return the result.
    int[] ans = new int[k];
    int i = 0;
    while (k-- > 0) {
      ans[i] = arr[i][0];
      i++;
    }

    return ans;
  }
}
