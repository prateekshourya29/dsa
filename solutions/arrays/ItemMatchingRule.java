package solutions.arrays;

import java.util.List;

// [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
public class ItemMatchingRule {
  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)     {
      int index = 0;
      if (ruleKey.equals("color")) {
          index = 1;
      }
      if (ruleKey.equals("name")) {
          index = 2;
      }

      int ans = 0;

      for (List<String> itm: items) {
        if (itm.get(index).equals(ruleValue))
          ans++;
      }

      return ans;
  }
}
