package solutions.arrays;

import java.util.HashSet;

// https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {
  public static boolean isValidSudoku(char[][] board) {
    int n = board.length;
    HashSet<Character> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
      set.clear();
      for (int j = 0; j < n; j++) {
        if (board[i][j] != '.') {
          if (set.contains(board[i][j])) {
            System.out.println("here1");
            return false;
          } else {
            set.add(board[i][j]);
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      set.clear();
      for (int j = 0; j < n; j++) {
        if (board[j][i] != '.') {
          if (set.contains(board[j][i])) {
            System.out.println("here2");
            return false;
          } else {
            set.add(board[j][i]);
          }
        }
      }
    }

    for (int i = 0; i < n; i += 3) {
      for (int j = 0; j < n; j+= 3) {
        set.clear();
        for (int x = i; x < i + 3; x++) {
          for (int y = j; y < j + 3; y++) {
            if (board[x][y] != '.') {
              if (set.contains(board[x][y])) {
                System.out.println("here3");
                return false;
              } else {
                set.add(board[x][y]);
              }
            }
          }
        }
      }
    }

    return true;
  }

  public static void main(String[] args) {
    char[][] board = 
    {{'8','3','.','.','7','.','.','.','.'}
    ,{'6','.','.','1','9','5','.','.','.'}
    ,{'.','9','8','.','.','.','.','6','.'}
    ,{'8','.','.','.','6','.','.','.','3'}
    ,{'4','.','.','8','.','3','.','.','1'}
    ,{'7','.','.','.','2','.','.','.','6'}
    ,{'.','6','.','.','.','.','2','8','.'}
    ,{'.','.','.','4','1','9','.','.','5'}
    ,{'.','.','.','.','8','.','.','7','9'}};

    System.out.println(isValidSudoku(board));
  }
}
