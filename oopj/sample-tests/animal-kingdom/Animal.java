import com.sun.jdi.event.ExceptionEvent;

class Animal {
  protected String name;
  protected String species;

  public Animal(String name, String species) {
    this.name = name;
    this.species = species;
  }

  public void moves() {
    System.out.println("");
  }

  public void catchError(Exception e) {
    switch(e.getClass().getCanonicalName()) {
      case "ExceptionEvent": 
        break;
    }
  }
}
