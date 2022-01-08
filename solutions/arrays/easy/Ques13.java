package solutions.arrays.easy;

public class Ques13 {
  // [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
  class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr: image) {
            int i = 0, n = arr.length - 1;
            while (i <= n) {
                int temp = (arr[i] == 1) ? 0 : 1;
                arr[i] = (arr[n] == 1) ? 0 : 1;
                arr[n] = temp;
                i++; n--;
            }
        }
        return image;
    }
  }
}
