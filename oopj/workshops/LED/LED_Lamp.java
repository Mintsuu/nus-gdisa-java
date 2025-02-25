public class LED_Lamp {
  private LED red, green, blue;
  public LED_Lamp() {
    this.red = new LED("red");
    this.green = new LED("green");
    this.blue = new LED("blue");
  }

  public boolean showLight(int lightIdx) {
    if(lightIdx > 2) {
      System.out.println("Error!! Expects 0, 1 or 2");
      return false;
    }

    if(this.red.isLEDOn()) this.red.turnOff();
    if(this.green.isLEDOn()) this.green.turnOff();
    if(this.blue.isLEDOn()) this.blue.turnOff();

    switch(lightIdx) {
      case 0:
      this.red.turnOn();
      System.out.println("Light is now red");
      break;
      case 1:
      this.green.turnOn();
      System.out.println("Light is now green");
      break;
      case 2:
      this.blue.turnOn();
      System.out.println("Light is now blue");
      break;
    }

    return true;
  }

}
