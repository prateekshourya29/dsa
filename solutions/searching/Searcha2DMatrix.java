package solutions.searching;

// https://leetcode.com/problems/search-a-2d-matrix/
public class Searcha2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;
    int start = 0;
    int end = m - 1;
    
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (matrix[mid][0] <= target && matrix[mid][n - 1] >= target) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
          int mi = s + (e - s) / 2;
          if (matrix[mid][mi] == target) {
            return true;
          } else if (matrix[mid][mi] > target) {
            e = mi - 1;
          } else {
            s = mi + 1;
          }
        }
        return false;
      } else if (matrix[mid][n - 1] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    
    return false;
  }
}
