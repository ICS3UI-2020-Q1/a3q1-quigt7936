import java.util.Scanner;

/**
 * Figures what the maximum integer is.
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get the users three integers
    System.out.println("Please enter three integers on separate lines");
    int numberOne = input.nextInt();
    int numberTwo = input.nextInt();
    int numberThree = input.nextInt();
   
    // intilize the biggest variable
    int biggest;

    // figure out if what number is biggest
    if (numberOne >= numberTwo && numberOne >= numberThree) {
      // numberOne is the biggest
      biggest = numberOne;

    } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
      // numberTwo is the biggest
      biggest = numberTwo;

    } else {
      // numberThree is the biggest
      biggest = numberThree;

    }
    // tell them what the maximum number is
    System.out.println("Maximum: " + biggest);
  }
}