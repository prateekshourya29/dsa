package solutions.functions;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Product {
  public static int product(int a, int b) {
    return a * b;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int num1 = in.nextInt();
    int num2 = in.nextInt();

    System.out.println("Product: " + product(num1, num2));

    in.close();
  }
}
