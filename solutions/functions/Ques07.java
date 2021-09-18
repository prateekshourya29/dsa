package solutions.functions;

import java.util.Scanner;

public class Ques07 {
  // Define a method to find out if a number is prime or not.
  public static boolean isPrime(int num) {
    int i = 2;
    while (i * i <= num) {
      if (num % i == 0) return false;
      i++;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();

    if (isPrime(num)) System.out.println("It's a prime number");
    else System.out.println("It's not a prime number");

    in.close();
  }
}
