package solutions.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/n-queens-ii/
public class NQueenII {
  static HashSet<Integer> col = new HashSet<>();
  static HashSet<Integer> posDiag = new HashSet<>(); // r + c
  static HashSet<Integer> negDiag = new HashSet<>(); // r - c

  public static boolean isValid(List<String> board, int r, int c, int n) {
    if (col.contains(c)) return false;
    if (posDiag.contains(r + c)) return false;
    if (negDiag.contains(r - c)) return false;

    return true;
  }


  public static int solve(int r, int n, List<String> board) {
    if (r == n) {
      return 1;
    }
    
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (isValid(board, r, i, n)) {
        String old = board.get(r);
        String s = board.get(r).substring(0, i) + 'Q' + board.get(r).substring(i + 1);
        board.remove(r);
        board.add(r, s);
        col.add(i);
        posDiag.add(r + i);
        negDiag.add(r - i);

        count += solve(r + 1, n, board);
        
        board.remove(r);
        board.add(r, old);
        col.remove(i);
        posDiag.remove(r + i);
        negDiag.remove(r - i);
      }
    }

    return count;
  }

  public static int totalNQueens(int n) {
    List<String> board = new ArrayList<>();
    String str = "";

    for (int i = 0; i < n; i++) {
      str += ".";
    }

    for (int i = 0; i < n; i++) {
      board.add(String.valueOf(str));
    }

    return solve(0, n, board);
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(totalNQueens(n));
  }
}
