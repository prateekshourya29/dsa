package solutions.arrays.easy;

public class Ques15 {
  // [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
  class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if (n % 2 == 1) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
  }
}
