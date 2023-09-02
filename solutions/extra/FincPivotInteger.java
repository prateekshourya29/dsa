package solutions.extra;

public class FincPivotInteger {
  public static int sumTillN(int n) {
    return n * (n + 1) / 2;
  }

  public static int pivotInteger(int n) {
    int start = 1;
    int end = n;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      int sumMid = sumTillN(mid);
      int sumOtherPart = sumTillN(n) - sumTillN(mid - 1);

      if (sumMid == sumOtherPart) {
        return mid;
      } else if (sumMid < sumOtherPart) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    System.out.println(pivotInteger(49));
  }
}
