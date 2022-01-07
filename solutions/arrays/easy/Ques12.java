package solutions.arrays.easy;

public class Ques12 {
  // [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
  class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int cur_alt = 0;
        for (int i = 0; i < gain.length; i++) {
            cur_alt += gain[i];
            if (cur_alt > highest) highest = cur_alt;
        }
        return highest;
    }
  }
}
