package solutions.arrays;

// [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
public class FirstAndLastPosition {
  public int[] searchRange(int[] nums, int target) {
    int n = nums.length;
    int left = 0;
    int right = n - 1;
    int mid;
    int[] ans = new int[] {-1, -1};
    
    while (left <= right) {
      mid = (left + right) / 2;
      
      if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        ans[0] = mid;
        ans[1] = mid;
        while (ans[0] != 0 && nums[ans[0] - 1] == target) ans[0]--;
        while (ans[1] != n - 1 && nums[ans[1] + 1] == target) ans[1]++;
        break;
      }
    }
    
    return ans;
  }
}
