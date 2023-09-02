package solutions.extra;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitMessageBasesOnLimit {
  public static int findTotalLength(int messageLength, int limit) {
    double l = messageLength / (double) limit;
    int min = (int) Math.ceil(l);
    int max = messageLength;

    while (min < max) {
      int mid = min + (max - min) / 2;
      int sizeOfLength = String.valueOf(mid).length();
      int newLimit = limit - sizeOfLength;

      int lower = 1;
      int upper = 10;

      int temp = mid;
      while (temp > 0) {
        int totalNumber = upper - lower;
        totalNumber = Math.min(totalNumber, temp);
        int digit = String.valueOf(lower).length();
        int lt = newLimit - digit;
        int available = totalNumber * lt;

        if (available <= messageLength) {
          messageLength -= available;
          temp -= totalNumber;
        } else {
          messageLength = 0;
          break;
        }

        lower = upper;
        upper *= 10;
      }

      if (messageLength == 0 && temp > 0) {
        max = mid;
      } else {
        min = mid + 1;
      }
    }

    return max;
  }

  public static String[] splitMessage(String message, int limit) {
    ArrayList<String> ans = new ArrayList<>();

    StringBuilder str = new StringBuilder(message);

    int totalLength = findTotalLength(str.length(), limit - 3);

    System.out.println(totalLength);

    return Arrays.copyOf(ans.toArray(), ans.size(), String[].class);
  }

  public static void main(String[] args) {
    String message = "this is really a very awesome message";
    int limit = 9;

    System.out.println(Arrays.toString(splitMessage(message, limit)));

  }
}
