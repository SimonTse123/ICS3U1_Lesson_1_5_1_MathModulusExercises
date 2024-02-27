class Circumference extends ConsoleProgram {

  /**
  * A program Circumference.java that computes the circumference of a circle given a radius from user
  * @author: Simon Tse
  */
  
  public void run() {
    
    // Declare Variables
    double dblRadius;
    double dblCircumference;

    // Get radius
    dblRadius = readDouble("Enter the radius of the circle: ");

    // Calculating Circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output Results
    System.out.println("The circumference of the circle with a radius of " + dblRadius + " is " + dblCircumference);
  }
}