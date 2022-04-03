package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/matrix-cells-in-distance-order/
public class MatrixCellsInDistanceOrder {
  public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
    int[][] ans = new int[rows * cols][2];
    int i = 0;
    
    for (int j = 0; j < rows; j++) {
      for (int k = 0; k < cols; k++) {
        ans[i][0] = j;
        ans[i][1] = k;
        i++;
      }
    }
    
    Arrays.sort(ans, (a, b) -> {
      int d1 = Math.abs(rCenter - a[0]) + Math.abs(cCenter - a[1]);
      int d2 = Math.abs(rCenter - b[0]) + Math.abs(cCenter - b[1]);
      
      return d1 - d2;
    });

    return ans;
  }
}
