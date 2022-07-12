package solutions.recursion;

import java.util.Arrays;

public class Maze {
  public static void path(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }
    if (r > 1) {
      path(p + "D", r - 1, c);
    }
    if (c > 1) {
      path(p + "R", r, c - 1);
    }
  }

  public static void pathDiagonal(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }
    if (r > 1 && c > 1) {
      pathDiagonal(p + "D", r - 1, c - 1);
    }
    if (r > 1) {
      pathDiagonal(p + "V", r - 1, c);
    }
    if (c > 1) {
      pathDiagonal(p + "H", r, c - 1);
    }
  }

  public static void allPath(String p, boolean[][] arr, int r, int c, int step, int[][] path ) {
    if (r == arr.length - 1 && c == arr[0].length - 1) {
      System.out.println(p);
      path[r][c] = step;
      for (int[] a: path) {
        System.out.println(Arrays.toString(a));
      }
      path[r][c] = 0;
      return;
    }

    if (arr[r][c] == false) {
      return;
    }

    arr[r][c] = false;
    path[r][c] = step;

    if (r < arr.length - 1) {
      allPath(p + "D", arr, r + 1, c, step + 1, path);
    }
    if (c < arr.length - 1) {
      allPath(p + "R", arr, r, c + 1, step + 1, path);
    }
    if (r > 0) {
      allPath(p + "U", arr, r - 1, c, step + 1, path);
    }
    if (c > 0) {
      allPath(p + "L", arr, r, c - 1, step + 1, path);
    }

    arr[r][c] = true; // backtrack
    path[r][c] = 0; // backtrack
  }

  public static void main(String[] args) {
    boolean[][] arr = {
      {true, true, true},
      {true, true, true},
      {true, true, true},
    };
    int[][] path = new int[arr.length][arr[0].length];
    allPath("", arr, 0, 0, 1, path); 
  }
}
