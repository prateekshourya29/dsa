package solutions.recursion;

import java.util.Arrays;

// https://leetcode.com/problems/sudoku-solver/
public class SudokuSolver {
  public static boolean isSafe(char[][] board, int i, int j, char value) {
    int n = board.length;

    for (int a = 0; a < n; a++) {
      if (board[i][a] == value) {
        return false;
      }
    }

    for (int a = 0; a < n; a++) {
      if (board[a][j] == value) {
        return false;
      }
    }

    int a = 3 * (i / 3);
    int b = 3 * (j / 3);

    for (int x = a; x < a + 3; x++) {
      for (int y = b; y < b + 3; y++) {
        if (board[x][y] == value) {
          return false;
        }
      }
    }

    return true;
  }

  public static boolean solve(char[][] board) {
    int row = -1;
    int col = -1;
    boolean isEmpty = false;

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == '.') {
          row = i;
          col = j;
          isEmpty = true;
          break;
        }
      }
      if (isEmpty) break;
    }

    if (isEmpty == false) return true;
    
    for (char value = '1'; value <= '9'; value++) {
      if (isSafe(board, row, col, value)) {
        board[row][col] = value;
        if (solve(board)) {
          return true;
        }
        board[row][col] = '.';
      }
    }

    return false;
  }

  public static void solveSudoku(char[][] board) {
    solve(board);
  }

  public static void main(String[] args) {
    char[][] board = 
    {{'5','3','.','.','7','.','.','.','.'}
    ,{'6','.','.','1','9','5','.','.','.'}
    ,{'.','9','8','.','.','.','.','6','.'}
    ,{'8','.','.','.','6','.','.','.','3'}
    ,{'4','.','.','8','.','3','.','.','1'}
    ,{'7','.','.','.','2','.','.','.','6'}
    ,{'.','6','.','.','.','.','2','8','.'}
    ,{'.','.','.','4','1','9','.','.','5'}
    ,{'.','.','.','.','8','.','.','7','9'}};

    solveSudoku(board);
    for (char[] b : board) {
      System.out.println(Arrays.toString(b));
    }
  }
}
