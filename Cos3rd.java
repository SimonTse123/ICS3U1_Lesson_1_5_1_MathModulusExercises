class Cos3rd extends ConsoleProgram {

  /**
  * A program Cos3rd.java that lets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side
  * @author: Simon Tse
  */
  
  public void run() {
    
    // Declare variables
    double dblSideOne;
    double dblSideTwo;
    double dblSideThree;
    double dblDegree;
    double dblRadians;

    // Get values for the 2 sides and angle
    dblSideOne = readDouble("Enter the value of the longer length of the triangle: ");
    dblSideTwo = readDouble("Enter the value for the shorter length of the triangle: ");
    dblDegree = readDouble("Enter the value for the contained angle of the triangle in degrees: ");

    // Calculate for the third side
    dblRadians = Math.PI * dblDegree / 180;
    dblSideThree = Math.sqrt(Math.pow(dblSideOne, 2) + Math.pow(dblSideTwo, 2) - 2 * dblSideOne * dblSideTwo * Math.cos(dblRadians));

    // Show result
    System.out.println("The value of the third side length is: " + dblSideThree);
    
  }
}