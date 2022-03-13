package solutions.functions;

import java.util.Scanner;

// Write a function that returns all prime numbers between two given numbers.
public class PrimeNumbersBetweenRange {
  public static boolean isPrime(int num) {
    int i = 2;
    while (i * i <= num) {
      if (num % i == 0) return false;
      i++;
    }
    return true;
  }

  public static void primeNumbers(int start, int end) {
    for (int i = start; i <= end; i++) {
      if (isPrime(i))
        System.out.println(i + "\t");
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int start = in.nextInt();
    int end = in.nextInt();

    primeNumbers(start, end);

    in.close();
  }
}
