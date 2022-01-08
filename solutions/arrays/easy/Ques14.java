package solutions.arrays.easy;

public class Ques14 {
  // [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
  class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int[] idx: indices) {
            for (int i = 0; i < n; i++) {
                arr[idx[0]][i]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][idx[1]]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1) count++;
            }
        }
        return count;
    }

    // Optimise Solution
    public int oddCells2(int m, int n, int[][] indices) {
      int[] row = new int[m];
      int[] col = new int[n];
      for (int[] idx: indices) {
          row[idx[0]]++;
          col[idx[1]]++;
      }
      int count = 0;
      for (int i = 0; i < m; i++)
          for (int j = 0; j < n; j++)
              if ((row[i] + col[j]) % 2 == 1) 
                  count++;
      return count;
    }
  }
}
