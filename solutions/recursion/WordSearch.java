package solutions.recursion;

// https://leetcode.com/problems/word-search/
public class WordSearch {
  public static boolean backtrack(char[][] board, String word, boolean[][] path, int i, int j) {
    if (word.isEmpty()) {
      return true;
    }

    if (path[i][j] == true) {
      return false;
    }

    if (word.length() == 1 && word.charAt(0) == board[i][j]) {
      return true;
    }

    char value = ' ';
    if (board[i][j] == word.charAt(0)) {
      value = word.charAt(0);
      word = word.substring(1);
    } else {
      return false;
    }

    path[i][j] = true;

    if (i < board.length - 1) {
      if (backtrack(board, word, path, i + 1, j)) {
        return true;
      }
    }
    if (j < board[0].length - 1) {
      if (backtrack(board, word, path, i, j + 1)) {
        return true;
      }
    }
    if (i > 0) {
      if (backtrack(board, word, path, i - 1, j)) {
        return true;
      }
    }
    if (j > 0) {
      if (backtrack(board, word, path, i, j - 1)) {
        return true;
      }
    }

    path[i][j] = false;
    if (value != ' ') {
      word = value + word;
    }

    return false;
  }


  public static boolean exist(char[][] board, String word) {
    int row = board.length;
    int col = board[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (board[i][j] == word.charAt(0)) {
          if (backtrack(board, word, new boolean[board.length][board[0].length], i, j)) {
            return true;
          }
        }
      }
    }

    return false;
  }

  public static void main(String[] args) {
    char[][] board = {
      {'A'},
    };
    String word = "A";

    System.out.println(exist(board, word));
  }
}
