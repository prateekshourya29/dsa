package solutions.functions;

import java.util.Scanner;

public class Ques11 {
  public static boolean isPythagorasTriplets(int a, int b, int c) {
      if (a > b) {
        if (a > c) return a * a == b * b + c * c;
        else return c * c == a * a + b * b;
      }
      else {
        if (b > c) return b * b == a * a + c * c;
        else return c * c == a * a + b * b;
      }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    if (isPythagorasTriplets(a, b, c)) System.out.println("It's a Pythagoras triplet");
    else System.out.println("It's not a Pythagoras triplet");

    in.close();
  }
}
