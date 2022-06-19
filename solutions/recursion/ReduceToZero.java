package solutions.recursion;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class ReduceToZero {
  public static int numberOfSteps(int num) {
    return steps(num, 0);
  }

  public static int steps(int n, int count) {
    if (n == 0) return count;
    return n % 2 == 0 ? steps(n / 2, count + 1) : steps(n - 1, count + 1);
  }

  public static void main(String[] args) {
    System.out.println(numberOfSteps(123));
  }
}
