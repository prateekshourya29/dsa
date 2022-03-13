package solutions.searching;

 // This is MountainArray's API interface.
 // You should not implement it, or speculate about its implementation
 // Dummy to remove syntax errors
  interface MountainArray {
    public int get(int index);
    public int length();
  }

// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
  public int findPeakElement(MountainArray mountainArr, int n) {
    int start = 0, end = n - 1;
    
    while (start <= end) {
      int mid = start + (end - start) / 2;
      
      int midEl = mountainArr.get(mid);
      int midEl2 = mountainArr.get(mid + 1);
      
      if (midEl > midEl2) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return start;
  }

public int binarySearch(MountainArray mountainArr, int target, int start, int end, Boolean isAsc) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      int ele = mountainArr.get(mid);
      
      if (ele == target) {
        return mid;
      } else if (ele > target) {
        if (isAsc) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
        
      } else {
        if (isAsc) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    
    return -1;
  }

  public int findInMountainArray(int target, MountainArray mountainArr) {
    int n = mountainArr.length() - 1;
    int peak = findPeakElement(mountainArr, n);
    int index = binarySearch(mountainArr, target, 0, peak, true);
    if (index == -1) {
      index = binarySearch(mountainArr, target, peak + 1, n, false);
    }
    
    return index;
  }
}
