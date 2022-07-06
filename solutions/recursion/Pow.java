package solutions.recursion;

// https://leetcode.com/problems/powx-n/
public class Pow {
  public static double pow(double x, long n) {
    if (n == 0 || x == 1) {
      return 1;
    }
    if (n == 1) {
      return x;
    }

    if (n % 2 == 0) {
      return pow(x * x, n / 2);
    } else {
      return x * pow(x, n - 1);
    }
  }
  public static double myPow(double x, int n) {
    long count = n;
    if (count < 0) {
      return 1 / pow(x, -1 * count);
    }
    return pow(x, n);
    
  }

  public static void main(String[] args) {
    double x = 2.00000;
    int n = 10;
    System.out.println(myPow(x, n));
  }
}
