package Triangle;
/**
 * TODO: implement class Triangle
 *
 * 1. This class has 3 attributes: side1, 
 * side2, side3 all in double. 
 * 
 * 2. It has one constructor that accepts 3 
 * double values and set them to its 3 sides. 
 * This constructor throws a bad triangle exception
 * with message "Invalid sides" if the given 3
 * sides do not represent a valid triangle.
 * 
 * 3. The class also has methods perimeter() 
 * and area() that compute the perimeter and 
 * area of the triangle.
 */
public class Triangle {
  
  private double side1, side2, side3;

  public Triangle(double side1, double side2, double side3) throws BadTriangleException {
    boolean isValidTriangle = TriangleUtility.isValidTriangle(side1, side2, side3);
    if(!isValidTriangle) throw new BadTriangleException();
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  } 

  public double perimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  public double area() {
    return 0.5 * this.side1 * this.side2 * (Math.sin(this.side3));
  }
  
}
