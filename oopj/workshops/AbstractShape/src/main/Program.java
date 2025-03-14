package main;

import shape.Shape;
import shape.Circle;
import shape.Rectangle;

public class Program 
{
  public static void main(String[] args) 
  {
    Shape circle = new Circle(5, "orange");
    System.out.printf("Area of %s %s = %.2f\n", 
            circle.getColor(), circle.getType(), circle.area());

    Shape rect = new Rectangle(4, 3, "green");
    System.out.printf("Area of %s %s = %.0f\n", 
            rect.getColor(), rect.getType(), rect.area());
  }
}




