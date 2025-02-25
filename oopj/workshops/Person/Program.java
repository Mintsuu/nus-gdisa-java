
public class Program {
  public static void main(String[] args) {
    // instantiates 4 different Person_v2 object
    // from the Person_v2 class
    Person john = new Person("John", 1990, 'm', "Scientist");
    Person mary = new Person("Mary", 1997, 'f', "Teacher");
    Person harry = new Person("Harry", 1984, 'm', "Miner");
    Person jane = new Person("Jane", 2012, 'f', "Student");
    
    // invoke the objects' method
    john.intro();
    mary.intro();
    harry.intro();
    jane.intro();
  }
}
