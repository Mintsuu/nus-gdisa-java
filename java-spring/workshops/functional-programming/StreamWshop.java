import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamWshop {
  public static void main(String[] args) {
    List<Staff> staffList = new ArrayList<>();
    staffList.add(new Staff("6c0231c1", "John", 5, 4293));
    staffList.add(new Staff("270d0145", "Mike", 6, 6530));
    staffList.add(new Staff("e75a1d7e", "Jean", 3, 2220));
    staffList.add(new Staff("c1c0a83a", "Kim", 4, 3390));

    // Exercise 1: Using streams' forEach(), 
    // print the name of every staff
    System.out.println("[Exercise 1: ForEach]");
    staffList.stream().forEach((staff) -> System.out.println(staff.getName()));
    // Exercise 2: Using streams, compute 
    // the total salary of all staff
    System.out.println("\n[Exercise 2: Sum]");
    double totalSal = staffList.stream().map(staff -> staff.getSalary()).reduce(0.0f, (total, salary) -> total + salary);
    System.out.println(totalSal);

    // Exercise 3: Using streams' filter(), 
    // retrieve all salary that are more than 
    // 3500 into a List, then print each of the 
    // object within the List
    System.out.println("\n[Exercise 3: Filter]");
    //staffList.stream().filter((staff) -> staff.getSalary() > 3500).forEach((staff) -> System.out.println(staff)); 
    staffList.stream().filter((staff) -> staff.getSalary() > 3500).forEach(System.out::println); 

    // Exercise 4: Using streams' map(), print 
    // the list of increments that are less 
    // than 200; given a staff's increment is 
    // such that a grade of 5 and above 
    // will yield a 8% increment (off of the staff's 
    // current salary), while any other grades
    // will only yield a 4% increment.
    System.out.println("\n[Exercise 4: Map]");
    staffList.stream().forEach((staff) -> {
      double increment;
      if(staff.getGrade() >= 5)  increment = staff.getSalary() * 0.08;
      else increment = staff.getSalary() * 0.04;

      if(increment < 200) System.out.println(staff.getName());
    });
    // Exercise 5: Using streams' sort(), sort 
    // the staff by salary in ascending 
    // order (least salary first) and print out
    // each staff object
    // You may need to add necessary methods
    // to Staff class
    System.out.println("\n[Exercise 5: Sort]");
    staffList.stream().sorted(Comparator.comparingDouble((staff) -> staff.getSalary())).forEach((staff) -> System.out.println(staff.toString()));

    // Exercise 6: Using streams' max(), display 
    // the highest salary among the staff
    System.out.println("\n[Exercise 6: Max]");
    double highestSalary = staffList.stream().mapToDouble(staff -> staff.getSalary()).max().getAsDouble();
    System.out.println(highestSalary);
    // Exercise 7: Using streams' reduce(), 
    // implement your own "max" function 
    // to display the highest salary among the staff
    System.out.println("\n[Exercise 7: Reduce");
    Staff highestReduceSalary = staffList.stream().reduce((s1, s2) -> s1.getSalary() > s2.getSalary() ? s1 : s2).get();
    System.out.println(highestReduceSalary);
  }
}
