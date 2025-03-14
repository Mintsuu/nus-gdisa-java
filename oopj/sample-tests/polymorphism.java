
class Animal {
  private String name;
  public Animal(String name) {
    this.name = name;
  }

  protected String getName() {
    return this.name;
  }

  protected void makeNoise() {
    System.out.println("Unknown noise.");
  }

  protected void sleep() {
    System.out.println("Animal is sleeping.");
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  protected void makeNoise() {
    System.out.println("Meow");
  }

  protected void eat() {
    System.out.printf("Cat %s is eating. %n", super.getName());
  }
}

class Program {
  public static void main(String[] args) {
    Animal myCat = new Cat("Muffins"); 
    myCat.makeNoise();
  }
}
