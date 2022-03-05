package solutions.searching.easy;

/* The isBadVersion API is defined in the parent class VersionControl.
  boolean isBadVersion(int version); 
*/

public class Ques03 {
  // [First Bad Version](https://leetcode.com/problems/first-bad-version/)

  boolean isBadVersion(int version) { return true; } // Dummy code to remove syntax error
  public int firstBadVersion(int n) {
    int start = 1, end = n, ans = 1;
    
    while (start <= end) {
      int mid = start + (end - start) / 2;
      
      if (isBadVersion(mid) == true) {
        ans = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return ans;
  }
}
