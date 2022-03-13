package solutions.arrays;

// [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
public class MaximumPopulationYear {
  public int maximumPopulation(int[][] logs) {
    int[] arr = new int[100];
    for (int[] log: logs) {
      for (int i=log[0]; i < log[1]; i++)
        arr[i-1950]++;
    }
    int index = 0;
    int count = 0; 
    for(int i = 0; i < 100; i++) {
      if (arr[i] > count) {
        count = arr[i];
        index = i;
      }
    }
      return index + 1950;
  }
}
