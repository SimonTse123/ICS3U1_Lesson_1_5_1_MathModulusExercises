class Hours extends ConsoleProgram {

  /**
  * A program Hours.java that lets you enter a number of hours, and that converts it to days and hours.
  * @author: Simon Tse
  */
  
  public void run() {
    
    // Declare variables
    int intHours;
    int intDays;
    int intFinalHours;

    // Get variables
    intHours = readInt("Enter the amount of hours you want to convert! ");

    // Calculations
    intDays = intHours / 24;
    intFinalHours = intHours % 24;

    // Show result
    System.out.println("That is about " + intDays + " days, and " + intFinalHours + " hours!");
    
  }
}