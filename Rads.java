class Rads extends ConsoleProgram {

  /**
  * A program Rads.java that converts degree measures to radian measures
  * @author: Simon Tse
  */
  
  public void run() {
    
    // Declare variables
    double dblDegree;
    double dblRad;

    //Get degree
    dblDegree = readDouble("Enter the degree amount: ");

    // Caculate radians
    dblRad = Math.PI * dblDegree / 180;

    //Show result
    System.out.println(dblDegree + " degrees in radians is: " + dblRad + "Rad.");
    
  }
}