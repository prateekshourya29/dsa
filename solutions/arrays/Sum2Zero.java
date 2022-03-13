package solutions.arrays;

// [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
public class Sum2Zero {
  public int[] sumZero(int n) {
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      arr[i] = i + 1;
      sum += i + 1;
    }
    arr[n-1] = -sum;
    return arr;
  }
}
