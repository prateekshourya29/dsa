package solutions.extra;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacter {
  public static char maximumOccurringCharacter(String text) {
    Map<Character, Integer> map = new HashMap<>();

    for (char t: text.toCharArray()) {
      if (map.containsKey(t)) {
        int value = map.get(t);
        map.replace(t, value + 1);
      } else {
        map.put(t, 1);
      }
    }

    char maxChar = ' ';
    int max = 0;
    for (Map.Entry<Character, Integer> entry: map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        maxChar = entry.getKey();
      }
    }

    return maxChar;
  }
  public static void main(String[] args) {
    String text = "abbbaacc";
    System.out.println(maximumOccurringCharacter(text));
  }
}
