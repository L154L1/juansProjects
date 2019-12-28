// What is the result?
// A. [sales:Ada, hr:Bob, sales:Bob, hr:Eva]
// B. [Ada:sales, Bob:sales, Bob:hr, Eva:hr]
// C. [hr:Eva, hr:Bob, sales:Bob, sales:Ada]
// D. [hr:Bob, hr:Eva, sales:Ada, sales:Bob]

// Answer: D

package q160_sorted_Comparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	String dept, name;
	public Employee(String d, String n) {
		dept = d;
		name = n;
	}
	public String toString() {
		return getDept() + ":" + getName();
	}
	public String getDept() { return dept; }
	public String getName() { return name; }

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee("sales", "Ada"),
				new Employee("sales", "Bob"),
				new Employee("hr", "Bob"),
				new Employee("hr", "Eva"));
				
				
		Stream<Employee> s = emps.stream()
				.sorted(Comparator.comparing((Employee e) -> e.getDept()).thenComparing((Employee e) -> e.getName()));
		List<Employee> eSorted = s.collect(Collectors.toList());
		System.out.println(eSorted);		// [hr:Bob, hr:Eva, sales:Ada, sales:Bob]
		
	}

}
