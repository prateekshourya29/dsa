package solutions.searching;

// [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
public class CountNegativeNumbersInASortedMatrix {
  public int countNegatives(int[][] grid) {
    int ans = 0;
    int row = grid.length, col = grid[0].length;

    for (int i = 0; i < row; i++) {
      int start = 0, end = col - 1;

      while (start <= end) {
        int mid = start + (end - start) / 2;

        if (grid[i][mid] < 0) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      
      ans += (row - i) * (col - start);
      col = start;
    }
    
    return ans;
  }
}