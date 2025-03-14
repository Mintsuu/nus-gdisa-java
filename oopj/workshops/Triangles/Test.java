import Triangle.BadTriangleException;
import Triangle.Triangle;

public class Test {
  public static void main(String[] args) {
    try {
      System.out.println("--- Test a valid triangle ---");
      Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
      System.out.println("Perimeter: " + triangle1.perimeter());
      System.out.println("Area: " + triangle1.area());

      System.out.println("--- Test an invalid triangle ---");
      Triangle triangle2 = new Triangle(1.0, 2.0, 4.0);
      System.out.println("Perimeter: " + triangle2.perimeter());
      System.out.println("Area: " + triangle2.area());
    } catch (BadTriangleException e) {
      System.out.println("Exception with message: " + e.getMessage());
    }
  }
}
