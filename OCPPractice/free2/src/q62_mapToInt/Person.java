// What is the result?
// A. 0.0
// B. 1500.0
// C. A compilation error occurs.
// D. 2000.0

// Answer: B

package q62_mapToInt;

import java.util.*;

public class Person {
	private String firstName;
	private int salary;
	public Person(String fN, int sal) {
		this.firstName = fN;
		this.salary = sal;
	}
	public int getSalary() { return salary; }
	public String getFirstName() { return firstName; }

	public static void main(String[] args) {
		List<Person> prog = Arrays.asList(
				new Person("Smith", 1500),
				new Person("John", 2000),
				new Person("Joe", 1000));
		double dVal = prog.stream()
				.filter(s -> s.getFirstName().startsWith("J"))
				.mapToInt(Person::getSalary)
				.average()
				.getAsDouble();
		System.out.print(dVal);		// 1500.0

	}

}
