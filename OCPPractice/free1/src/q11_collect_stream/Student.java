// Passquestion q24

// What is the result?
// A. [Java EE: Helen:Houston]
//    [Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
// B. Java EE
//    Java ME
// C. [Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
//    [Java EE: Helen:Houston]
// D. A compilation error occurs.

//Correct Answer: B

package q11_collect_stream;

import java.util.*;
import java.util.stream.*;

public class Student {
	
	String course, name, city;
	public Student (String name, String course, String city) {
	this.course = course; this.name = name; this.city = city;
	}
	public String toString() {
	return course + ":" + name + ":" + city;
	}
	
	String getCourse() {return course;}

	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
				new Student ("Jessy", "Java ME", "Chicago"),
				new Student ("Helen", "Java EE", "Houston"),
				new Student ("Mark", "Java ME", "Chicago"));
				stds.stream().collect(Collectors.groupingBy(Student::getCourse))
				.forEach((src, res) -> System.out.println(src));
				
	}

}

//Java EE
//Java ME
