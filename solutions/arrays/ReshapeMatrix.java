package solutions.arrays;

// [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)
public class ReshapeMatrix {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    int m = mat.length;
    int n = mat[0].length;
    
    if ((m * n != r * c) || (m==r && n==c)) {
      return mat;
    }
    
    int[][] arr = new int[r][c];
    
    int x = 0, y = 0;
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[x][y] = mat[i][j];
        y++;
        if (y == c) {
          x++;
          y = 0;
        }
      }
    }
    
    return arr;
  }
}
