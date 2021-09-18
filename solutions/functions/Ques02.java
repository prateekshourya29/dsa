package solutions.functions;

import java.util.Scanner;

public class Ques02 {
  //Define a program to find out whether a given number is even or odd.

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = in.nextInt();

    if (isEven(num)) {
      System.out.println("Number is even");
    }
    else System.out.println("Number is odd");
    
    in.close();
  }
}
