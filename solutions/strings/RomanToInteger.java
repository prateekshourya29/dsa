package solutions.strings;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
  public static int getInt(char ch) {
    switch(ch) {
      case 'I': return 1;
      case 'V': return 5;
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      default: return 0;
    }
  }

  public static int romanToInt(String s) {
    char[] arr = s.toCharArray();
    int ans = 0;
    int prev = 0;
    
    for (int i = arr.length - 1; i >= 0; i--) {
      int value = getInt(arr[i]);
  
      if (value < prev) {
        ans -= value;
      } else {
        ans += value;
      }

      prev = value;
    }
    
    return ans;
  }

  public static void main(String[] args) {
    String s = "MCMXCIV";
    System.out.println(romanToInt(s));
  }
}
