package solutions.searching;

import java.util.Scanner;

// [Square Root](https://leetcode.com/problems/sqrtx/)
public class SquareRoot {
  public static int mySqrt(int x) {
    long start = 0;
    long end = x;
    long ans = 0;
    
    while (start <= end) {
      long mid = start + (end - start) / 2;
      
      if (mid * mid == x) return (int)mid;
      else if (mid * mid > x) end = mid - 1;
      else {
        start = mid + 1;
        ans = mid;
      }
      
    }
    
    return (int)ans;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    System.out.println(mySqrt(x));

    in.close();
  }
}
