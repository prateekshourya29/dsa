package solutions.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class KthLargestElementInArray {
  // Using Sorting O(nlogn) solution
  public static int findKthLargest(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();

    for (int n: nums) {
      set.add(n);
    }

    Arrays.sort(set.toArray());

    System.out.println(set);

    return -1;
  }

  public static int quickSelect(int[] nums, int start, int end, int k) {
    int n = nums.length;
    int pivot = nums[end];
    int i = start;
    int j = start;

    while (j < end) {
      if (nums[j] < pivot) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
      j++;
    }

    nums[end] = nums[i];
    nums[i] = pivot;

    if (i == n - k) {
      return nums[i];
    } else if (i > n - k) {
      return quickSelect(nums, 0, i - 1, k);
    } else {
      return quickSelect(nums, i + 1, end, k);
    }
  }

  // Using QuickSelect O(n) average case -> When we select the element that will be in the middle of the array.
  // Worst Case O(n^2) -> When we choose the element which comes at the end of the array.
  public static int findKthLargestQuickSelect(int[] nums, int k) {
    return quickSelect(nums, 0, nums.length - 1, k);
  }

  public static void main(String[] args) {
    int[] nums = {3,2,3,1,2,4,5,5,6};
    int k = 2;
    System.out.println(findKthLargestQuickSelect(nums, k));
  }
}
