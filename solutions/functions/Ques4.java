package solutions.functions;

import java.util.Scanner;

public class Ques4 {
  //Write a program to print the sum of two numbers entered by user by defining your own method.
  public static int sum(int a, int b) {
    return a + b;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int num1 = in.nextInt();
    int num2 = in.nextInt();

    System.out.println("Sum: " + sum(num1, num2));

    in.close();
  }
}
