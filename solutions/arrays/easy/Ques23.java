package solutions.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class Ques23 {
  // [Saddle Point In Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
  class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int smallest = matrix[i][0];
            int index = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                    index = j;
                }
            }
            int largest = matrix[0][index];
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][index] > largest) {
                    largest = matrix[j][index];
                }
            }
            
            if (smallest == largest) {
                list.add(smallest);
            }
        }
        
        return list;
    }
  }
}
