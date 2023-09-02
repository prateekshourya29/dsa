package solutions.searching;

public class KokoEatingBananas {
  public static int minEatingSpeed(int[] piles, int h) {
    int start = 1;
    int end = Integer.MIN_VALUE;

    int mid = -1;

    for (int p: piles) {
      if (p > end) end = p;
    }

    while (start <= end) {
      mid = start + (end - start) / 2;

      int[] copy = piles.clone();
      int hours = 0;
      int i = 0;

      while (i < copy.length) {
        if (hours > h) break;
        hours++;
        if (copy[i] == 0) {
          i++;
          continue;
        }
        if (copy[i] <= mid) {
          copy[i] = 0;
          i++;
        } else {
          copy[i] -= mid;
        }
      }

      if (hours <= h) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return start;
  }

  public static void main(String[] args) {
    int[] piles = {30,11,23,4,20};
    int h = 6;
    System.out.println(minEatingSpeed(piles, h));
  }
}
