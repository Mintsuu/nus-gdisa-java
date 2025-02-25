import java.time.LocalDate;

public class Person {
  // instance variables
  private String name;
  private int yob;
  private char gender;
  private String job;
  // constructor
  public Person(String name, int yob, char gender, String job) {
    this.name = name;
    this.yob = yob ;
    this.gender = gender;
    this.job = job;
  }
  // a method to introduce itself
  public void intro() {
    String genderStr = (gender == 'm') ? "Male" : "Female";
    int age = LocalDate.now().getYear() - this.yob;

    if(genderStr == "Male")
    System.out.printf("%s, %d, %s.   \n", this.name, age, this.job);
    else 
    System.out.printf("%s, %s.   \n", this.name, this.job);
  }
}
