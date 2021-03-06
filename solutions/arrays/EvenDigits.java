package solutions.arrays;

// [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
public class EvenDigits {
  public int findNumbers(int[] nums) {
    int even = 0;
    for (int num: nums) {
      int count = 0;
      while (num > 0) {
        num = num / 10;
        count++;
      }
      if (count % 2 == 0) even++;
    }
    return even;
  }
}
