package solutions.arrays;

public class SumofSquareNumbers {
  public static boolean judgeSquareSum(int c) {
    long start = 0, end = (long) Math.sqrt(c);
    
    while (start <= end) {
      if ((start * start) + (end * end) == c) {
        return true;
      } else if ((start * start) + (end * end) > c) {
        end--;
      } else {
        start++;
      }
    }
    
    return false;
  }

  public static void main(String[] args) {
    System.out.println(judgeSquareSum(3));
  }
}
