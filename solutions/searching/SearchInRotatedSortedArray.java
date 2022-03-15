package solutions.searching;

public class SearchInRotatedSortedArray {
  public static int findPivot(int[] nums) {
    int n = nums.length - 1;
    
    int start = 0;
    int end = n - 1;
    
    int pivot = n;
    
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] > nums[mid + 1]) {
        pivot = mid;
        break;
      } else if (nums[start] > nums[mid]) {
          end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return pivot;
  }

  public static int binarySearch(int[] nums, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) return mid;
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }
    
    return -1;
  } 

  public static int search(int[] nums, int target) {
    int pivot = findPivot(nums);
    int index = binarySearch(nums, target, 0, pivot);
    if (index == -1) index = binarySearch(nums, target, pivot + 1, nums.length - 1);
    
    return pivot;
  }

  public static void main(String[] args) {
    System.out.println(search(new int[] {4,7,4,4,4,4}, 0));
  }
}
