import java.util.*;

public class ArrayListExercise {
	
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alex", 23, "USA"));
		list.add(new Employee("Dave", 34, "India"));
		list.add(new Employee("Carl", 21, "USA"));
		list.add(new Employee("Joe", 56, "Russia"));
		list.add(new Employee("Amit", 64, "China"));
		list.add(new Employee("Ryan", 19, "Brazil"));
		
	System.out.println("Sorting all the employees by country name");
		Collections.sort(list, (e1, e2) -> e1.country.compareTo(e2.country));

		for (Employee emp : list) {
			System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
		}
	}

}
