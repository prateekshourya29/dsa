package solutions.extra;

import java.util.Scanner;

public class Homework4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Month Value [1 to 12]");
    System.out.println("(1 - January and 12 - December)");
    int month = in.nextInt();

    System.out.print("Corresponding Academic Semseter is: ");
    switch (month) {
      case 1:
        System.out.println("Winter Break");
        break;
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Spring Semester");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Summer break");
        break;
      case 9:
      case 10:
      case 11:
      case 12:
        System.out.println("Fall Semester");
        break;
      default:
        System.out.println("Please Enter Correct Month Value!");
    }

    in.close();
  }
}
