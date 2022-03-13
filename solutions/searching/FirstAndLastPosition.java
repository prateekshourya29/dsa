package solutions.searching;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {
  public int[] searchRange(int[] nums, int target) {
    int first = -1, last = -1;
    int start = 0, end = nums.length - 1;
          
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        first = mid;
        end = mid - 1;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    start = 0;
    end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        last = mid;
        start = mid + 1;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return new int[] {first, last};
  }
}
