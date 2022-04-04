package solutions.sorting;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class AverageSalaryExcludingMaxAndMinSalary {
  public double average(int[] salary) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    // Find the max and min salary from the array.
    for (int i = 0; i < salary.length; i++) {
      if (salary[i] > max) max = salary[i];
      if (salary[i] < min) min = salary[i];
    }
    
    // Add all salary excluding the max and min one.
    double ans = 0;
    for (int i = 0; i < salary.length; i++) {
      if (salary[i] != max && salary[i] != min) {
        ans += salary[i];
      }
    }

    // Return the average of all the salraies.
    return ans / (salary.length - 2);
  }
}
