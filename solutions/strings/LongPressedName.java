package solutions.strings;

// https://leetcode.com/problems/long-pressed-name/
public class LongPressedName {
  public static boolean isLongPressedName(String name, String typed) {
    int countN = 0, countT = 0;
    int i = 0, j = 0;
    
    int n = name.length(), t = typed.length();
    
    while (i < n && j < t) {
      char c = name.charAt(i);
      
      do {
        i++;
        countN++;
      } while (i < n && name.charAt(i) == c);
      
      while (j < t && typed.charAt(j) == c) {
        j++;
        countT++;
      }
      
      if (countT < countN) return false;
      
      countT = 0;
      countN = 0; 
    }
    
    if (j == t && i == n) return true;
    return false;
  }

  public static void main(String[] args) {
    String name = "saeed", typed = "ssaaedd";
    System.out.println(isLongPressedName(name, typed));
  }
}
