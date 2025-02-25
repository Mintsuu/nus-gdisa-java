// A class to model a LED
public class LED {
  private boolean isOn;
  public String color;

  // constructor to initialize itself
  public LED(String color) {
    isOn = false;
    this.color = color;
  }

  // method to return its current color
  public String getColor() {
    return color;
  }

  // method to indicate if it is currently ON or OFF
  public boolean isLEDOn() {
    return isOn;
  }

  // method to turn itself ON
  public void turnOn() {
    if (!isLEDOn())
      isOn = true;
  }

  // method to turn itself OFF
  public void turnOff() {
    if (isLEDOn()) 
      isOn = false;
  }
}

