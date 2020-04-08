import java.util.Scanner;
/**
* This program does stack things.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-04-05
*/


public class Stack {
  /**
  * This method asks for user input.
  */
  public static void main(String[] args) {
    
    // gets the user's input for the stack
    MrCoxallStack userStack = new MrCoxallStack();
    
    while (true) {
      System.out.println("Enter a positive integer to push.");
      System.out.println("Enter -1 to exist program.");
      Scanner userInput = new Scanner(System.in);
      if (userInput.hasNextInt()) {
        int userInt = userInput.nextInt();
        if (userInt == -1) {
          System.out.println("Bye-Bye!");
          break;
        } else if (userInt < 0) {
          System.out.println("Please enter a positive number.");
        } else {
          System.out.println(userStack.push(userInt));
        }
      } else {
        System.out.println("Invalid Input. Try again.");
        break;
      }
    }
  }
}