package solutions.functions;

import java.util.Scanner;

public class Ques01 {
  // Define two methods to print the maximum and the minimum number
  // respectively among three numbers entered by the user.

  public static int max(int a, int b, int c) {
    if (a > b) {
      if (a > c) return a;
      else return c;
    }
    else {
      if (b > c) return b;
      else return c;
    }
  }

  public static int min(int a, int b, int c) {
    if (a < b) {
      if (a < c) return a;
      else return c;
    }
    else {
      if (b < c) return b;
      else return c;
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1, num2, num3;

    System.out.println("Enter 3 numbers : ");
    num1 = in.nextInt();
    num2 = in.nextInt();
    num3 = in.nextInt();

    System.out.println("Largest number is " + max(num1, num2, num3));
    System.out.println("Smallest number is " + min(num1, num2, num3));
    in.close();
  }
}
