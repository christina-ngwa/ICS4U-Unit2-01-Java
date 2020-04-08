import java.util.ArrayList;
/**
* This program does stack things.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-04-05
*/


public class MrCoxallStack {
  /**
  * This method asks for user input.
  */
  private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
  private static String update = "";
  
  /**
  * Prints the entire stack.
  */
  public String print() {
    update = "\nStack: " + stackArray.toString();
    return update;
  }

  /**
  * Adds value to stack.
  */
  public String push(int value) {
    stackArray.add(value);
    update = print();
    return update;
  }
}