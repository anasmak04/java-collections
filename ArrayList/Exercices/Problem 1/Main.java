import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alex", 23, "USA"));
		list.add(new Employee("Dave", 34, "India"));
		list.add(new Employee("Carl", 21, "USA"));
		list.add(new Employee("Joe", 56, "Russia"));
		list.add(new Employee("Amit", 64, "China"));
		list.add(new Employee("Ryan", 19, "Brazil"));

   // Find employees aged over 50
    for(Employee emp : list){
      if(emp.age > 50){
        System.out.println(emp.name);
      }
    }

    
  }
}