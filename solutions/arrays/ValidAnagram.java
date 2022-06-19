package solutions.arrays;

import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
  public static boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (char c: s.toCharArray()) {
      if (map.containsKey(c)) {
        int value = map.get(c);
        map.replace(c, value + 1);
      } else {
        map.put(c, 1);
      }
    }

    for (char c: t.toCharArray()) {
      if (map.containsKey(c)) {
        int value = map.get(c);
        if (value == 1) map.remove(c);
        else map.replace(c, value - 1);
      } else {
        return false;
      }
    }

    return map.isEmpty();
  }
  public static void main(String[] args) {
    String s = "rat", t = "car";
    System.out.println(isAnagram(s, t));
  }
}
