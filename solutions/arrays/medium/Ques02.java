package solutions.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class Ques02 {
  // [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
  class Solution {
    public void setZeroes(int[][] matrix) {
      int row = matrix.length;
      int col = matrix[0].length;
      Set<Integer> row_set = new HashSet<>();
      Set<Integer> col_set = new HashSet<>();
      
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          if (matrix[i][j] == 0) {
            row_set.add(i);
            col_set.add(j);
          }
        }
      }
      
      for (int i = 0; i < row; i++) {
        for ( int j = 0; j < col; j++) {
          if (row_set.contains(i) || col_set.contains(j)) {
            matrix[i][j] = 0;
          }
        }
      }
    }
  }
}
