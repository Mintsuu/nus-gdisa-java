package Triangle;

/**
 * TODO: implement the custom Exception 
 * class BadTriangleException
 */
public class BadTriangleException extends Exception{
  private String errorMessage = "Invalid sides";
  public BadTriangleException() {
    super();
  }

  public BadTriangleException(String message) {
    super(message); 
  }
  
  @Override
  public String getMessage() {
    return this.errorMessage;
  }
}
