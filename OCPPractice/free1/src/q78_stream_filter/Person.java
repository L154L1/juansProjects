// What is the result?
// A. 0
// B. A compilation error occurs at line n1.
// C. An Exception is thrown at run time.
// D. 2

// Correct Answer: A

package q78_stream_filter;

import java.util.*;
import java.util.stream.*;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() { return name; }
	public int getAge() { return age; }

	public static void main(String[] args) {
		List<Person> sts = Arrays.asList(
				new Person("Jack", 30),
				new Person("Mike Hill", 21),
				new Person("Thomas Hill", 24));
		Stream<Person> resList = sts.stream().filter(s -> s.getAge() >= 25);	// line n1			// filter will execute without terminal operator in the following statement.
		long count = resList.filter(s -> s.getName().contains("Hill")).count();
		
		System.out.print(count);			// 0

	}

}
