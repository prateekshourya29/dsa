package solutions.functions;

import java.util.Scanner;

public class Ques14 {
  // Write a function that returns the sum of first n natural numbers.
  public static int sumOfNaturalNumber(int limit) {
    return limit * (limit + 1) / 2;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int limit = in.nextInt();

    System.out.println("Sum of first " + limit + " natural number is: " + sumOfNaturalNumber(limit));
    
    in.close();
  }
}
