package solutions.recursion;

// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class SumOfDigits {
  public static int digitsSum(int n) {
    if (n <= 9) return n;

    return n % 10 + digitsSum(n / 10);
  }

  public static void main(String[] args) {
    System.out.println(digitsSum(6361));
  }
}
