package solutions.extra;

import java.util.Scanner;

public class Lab4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter two numbers:");
    int a = in.nextInt();
    int b = in.nextInt();

    System.out.print("The biggest number between " + a + " and " + b + " is: ");
    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }

    in.close();
  }
}
