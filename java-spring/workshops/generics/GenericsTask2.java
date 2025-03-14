public class GenericsTask2 {
  public static void main(String[] args) {
    System.out.println("Result: " + 
      Compute.compute("add", Long.valueOf(1), Long.valueOf(2)));
    System.out.println("Result: " + 
      Compute.compute("minus", 2, 1));
    System.out.println("Result: " + 
      Compute.compute("mul", 2.0f, 5.5f));
    System.out.println("Result: " + 
      Compute.compute("div", 8.0, 0.0));
    System.out.println("Result: " + 
      Compute.compute("div", 3, 1));
  }
}

class Compute {
  public static <T extends Number> double compute(String op, T x, T y) {
    // Todo
    // Implement all 4 operations (add/minus/mul/div)
    // as seen in static main(). For op "div", check for and handle
    // "divide by zero" errors by returning 0.0 for such cases

    double result = 0.0;
    double xVal = x.doubleValue();
    double yVal = y.doubleValue();

    if(yVal == 0.0) return result;
    switch(op) {
      case "add":
      result = xVal + yVal;
      break;
      case "minus":
      result =  xVal - yVal;
      break;
      case "mul":
      result =  xVal * yVal;
      break;
      case "div":
      result =  xVal/yVal;
      break;
    }

    return result;

  }
}
