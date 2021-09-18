package solutions.functions;

import java.util.Scanner;

public class Ques6 {
  // Write a program to print the circumference and area of a circle
  // of radius entered by user by defining your own method.
  public static double circumference(double radius) {
    return 2 * (22/7) * radius;
  }

  public static double area(double radius) {
    return (22/7) * radius * radius;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter radius of the circle");
    double radius = in.nextDouble();

    System.out.println("Circumference of Circle: " + circumference(radius));
    System.out.println("Area of Circle: " + area(radius));

    in.close();
  }
}
