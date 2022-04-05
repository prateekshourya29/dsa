package solutions.arrays;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int start = 0, end = height.length - 1, maxArea = 0;
    
    // Check all area using two pointer and find the max by decreasing the size of the array based on min(start, end).
    while (start < end) {
      int area = Math.min(height[start], height[end]) * (end - start);
      if (area > maxArea) maxArea = area;
      if (height[start] < height[end]) {
        start++;
      } else {
        end--;
      }
    }
    
    return maxArea;
  }
}
