package ClubMembers;
public class Person {
  private String surname, firstName, secondName;
  public Person(String surname, String firstName, String secondName) { 
    this.surname = surname;
    this.firstName = firstName;
    this.secondName = secondName;
  }

  public String getName() {
    return surname + " " + firstName + " " + secondName;
  }
}
