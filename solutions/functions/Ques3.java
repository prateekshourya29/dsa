package solutions.functions;

import java.util.Scanner;

public class Ques3 {
  //A person is eligible to vote if his/her age is greater than or equal to 18. 
  //Define a method to find out if he/she is eligible to vote.
  public static boolean isEligible(int age) {
    return age >= 18;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your age: ");

    int age = in.nextInt();
    if (isEligible(age)) {
      System.out.println("You're eligible to vote!");
    }
    else System.out.println("You're not eligible to vote.");

    in.close();
  }
}
