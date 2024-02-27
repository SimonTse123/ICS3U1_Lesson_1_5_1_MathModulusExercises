class AreaSin extends ConsoleProgram {

  /**
  * A program AreaSin.java that uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle.
  * @author: Simon Tse
  */
  
  public void run() {
    
    // Declare variables
    double dblSideOne;
    double dblSideTwo;
    double dblDegree;
    double dblRadians;
    double dblArea;

    // Get variables
    dblSideOne = readDouble("Enter the value for the longer length of the triangle: ");
    dblSideTwo = readDouble("Enter the value for the shorter length of the triangle: ");
    dblDegree = readDouble("Enter the value for the contained angle of the triangle in degrees: ");

    // Calculate for the area
    dblRadians = Math.PI * dblDegree / 180;
    dblArea = dblSideOne * dblSideTwo * Math.sin(dblRadians) / 2;

    // Show result
    System.out.println("The area of the triangle is: " + dblArea);
    
  }
}