package Triangle;

public class TriangleUtility {
  /**
   * Return if the given 3 sides can form a valid triangle.
   * 
   * You can make use of this method if necessary.
   * 
   * @param side1
   * @param side2
   * @param side3
   * @return true if the 3 given sides can form a valid triangle, false otherwise.
   */
  public static boolean isValidTriangle(double side1, double side2, double side3) {
    return side1 > 0 && side2 > 0 && side3 > 0 && 
    side1 + side2 > side3 && 
    side1 + side3 > side2 && 
    side2 + side3 > side1;
  }
}
