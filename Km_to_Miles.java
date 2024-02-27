class Km_to_Miles extends ConsoleProgram {

  /**
  * A program Km_to_Miles.java  that lets you enter a distance in kilometers and that converts it into miles.
  * @author: Simon Tse
  */
  
  public void run() {

    // Declare variables
    double dblKm;
    double dblMiles;

    // Get variables
    dblKm = readDouble("Enter the number of Km you want to convert: ");

    // Calculations
    dblMiles = dblKm * 0.621371;

    // Show result
    System.out.println("That is about " + dblMiles + " miles!");
    
  }
}
