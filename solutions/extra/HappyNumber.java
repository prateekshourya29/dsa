package solutions.extra;

import java.util.HashSet;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {
  public static int sumSquare(int n) {
    int result = 0;
    while (n > 0) {
      int digit = n % 10;
      result += digit * digit;
      n = n / 10;
    }
    return result;
  }
  
  public static boolean isHappy(int n) {
    HashSet<Integer> set = new HashSet<>();
    
    while (n != 1) {
      if (set.contains(n)) {
        return false;
      }
      set.add(n);
      n = sumSquare(n);
    }
    
    return true;
  }

  public static boolean isHappyTwoPointer(int n) {
    int fast = sumSquare(n);
    int slow = n;
    
    while (fast != 1 && fast != slow) {
      slow = sumSquare(slow);
      fast = sumSquare(sumSquare(fast));
    }
    
    return fast == 1;
  }

  public static void main(String[] args) {
    System.out.println(isHappyTwoPointer(19));
  }
}
