package solutions.recursion;

// https://leetcode.com/problems/path-with-maximum-gold/
public class PathWithMaximumGold {
  public static boolean isValid(int[][] grid, boolean[][] path, int i, int j) {
    if (i > grid.length - 1 || i < 0 || j > grid[0].length - 1 || j < 0) {
      return false;
    } 
    if (grid[i][j] == 0) {
      return false;
    }
    if (path[i][j] == true) {
      return false;
    }
    return true;
  }

  public static int backtrack(int[][] grid, boolean[][] path, int i, int j) {
    path[i][j] = true;

    int ans = grid[i][j];
    int max = 0;

    if (isValid(grid, path, i + 1, j)) {
      int curr = backtrack(grid, path, i + 1, j);
      if (curr > max) max = curr;
    }
    if (isValid(grid, path, i - 1, j)) {
      int curr = backtrack(grid, path, i - 1, j);
      if (curr > max) max = curr;
    }
    if (isValid(grid, path, i, j + 1)) {
      int curr = backtrack(grid, path, i, j + 1);
      if (curr > max) max = curr;
    }
    if (isValid(grid, path, i, j - 1)) {
      int curr = backtrack(grid, path, i, j - 1);
      if (curr > max) max = curr;
    }

    path[i][j] = false;
    return ans + max;
  }

  public static int getMaximumGold(int[][] grid) {
    int max = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (isValid(grid, new boolean[grid.length][grid[i].length], i, j)) {
          int curr = backtrack(grid, new boolean[grid.length][grid[i].length], i, j);
          if (curr > max) max = curr;
        }
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[][] grid = {{1,0,7,0,0,0},{2,0,6,0,1,0},{3,5,6,7,4,2},{4,3,1,0,2,0},{3,0,5,0,20,0}};
    System.out.println(getMaximumGold(grid));
  }
}
