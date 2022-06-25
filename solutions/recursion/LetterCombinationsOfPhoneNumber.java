package solutions.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
  public static List<String> combinations(String p, String up, HashMap<Character, String> map) {
    List<String> ans = new ArrayList<>();
    if (up.isEmpty()) {
      if (!p.isEmpty()) {
        ans.add(p);
      }
      return ans;
    }

    char key = up.charAt(0);
    String value = map.get(key);
    for (char c : value.toCharArray()) {
      ans.addAll(combinations(p + c, up.substring(1), map));
    }

    return ans;
  }

  public static List<String> letterCombinations(String digits) {
    HashMap<Character, String> map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");

    return combinations("", digits, map);
  }

  public static void main(String[] args) {
    String digits = "";
    System.out.println(letterCombinations(digits));
  }
}
