package solutions.sorting;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/
public class AssignCookies {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    
    int count = 0;
    
    int i = 0, j = 0;
    while (i < g.length && j < s.length) {
      if (s[j] >= g[i]) {
        count++;
        i++;
        j++;
      } else {
        j++;
      }
    }
    
    return count;
  }
}
