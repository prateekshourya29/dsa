package solutions.arrays;
import java.util.ArrayList;
import java.util.List;

// [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
public class KidsWithGreatestCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    ArrayList<Boolean> ans = new ArrayList<>();
    int max = candies[0];
    for (int i = 1; i < candies.length; i++) {
      if (candies[i] > max) max = candies[i];
    }
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] + extraCandies >= max) {
        ans.add(true);
        continue;
      }
      ans.add(false);
    }
    return ans;
  }
}
