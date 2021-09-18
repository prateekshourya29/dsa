package solutions.functions;

import java.util.Scanner;

public class Ques09 {
  public static int factorial(int num) {
    if (num < 0) return -1;
    if (num == 1 || num == 0) return 1;
    return num * factorial(num - 1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();
    int factorial_value = factorial(num);

    if (factorial_value == -1) System.out.println("Please enter a positive value");
    else System.out.println("Factorial is: " + factorial_value);

    in.close();
  }
}
