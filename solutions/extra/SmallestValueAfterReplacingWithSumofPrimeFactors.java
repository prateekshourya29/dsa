package solutions.extra;

public class SmallestValueAfterReplacingWithSumofPrimeFactors {
  public static int nextDivisibleValue(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return i;
      }
    }

    return n;
  }

  public static int smallestValue(int n) {
    int sum = n;
    int ans = n;

    while (nextDivisibleValue(sum) != sum) {
      sum = 0;
      while (n != 1) {
        int nextDiv = nextDivisibleValue(n);
        sum += nextDiv;
        n /= nextDiv;
      }
      n = sum;
      ans = Math.min(ans, sum);
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(smallestValue(15));
  }
}
