public class Person {

  private String name;
  private int age;
  private char gender;
  private double height;

  public Person(String _name, int _age, char _gender, double _height) {
    name = _name;
    age = _age;
    gender = _gender;
    height = _height;
  }
  public void intro() {
    String genderStr = (gender == 'm' ? "Male" : "Female");
    System.out.printf("%s, %d, %s, %.1fm.\n", name, age, genderStr, height);
  }
}
