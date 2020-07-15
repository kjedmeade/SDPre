import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first whole number you would like to add.");
    int firstWhole= keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    int secondWhole= keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    int thirdWhole= keyboard.nextInt();

    System.out.println("Please enter the first decimal number you would like to add.");
    double firstDecimal= keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double secondDecimal= keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    double thirdDecimal= keyboard.nextDouble();

    int whole= firstWhole + secondWhole +thirdWhole;
    double decimal= firstDecimal + secondDecimal + thirdDecimal;

    System.out.println("The sum of " + firstWhole + " + "  + secondWhole + " + "  +  thirdWhole + " = "+ whole);
    System.out.println("The sum of "+ firstDecimal + " + "  + secondDecimal+ " + "  + thirdDecimal + " = "+ decimal);

    keyboard.close();
  }
}
