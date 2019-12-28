// Java predicate is a function interface and its functional method is test(Object). Predicate interface has a default 
// method that returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.


package Test2Q72_predicate_and_method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Labs {

	public static void main(String[] args) {
		List<Employer> list = new ArrayList<Employer>();
		list.add(new Employer("John", 12000));
		list.add(new Employer("Alice", 11000));
		list.add(new Employer("Dean", 16700));
		
		Predicate<Employer> nFilter = (e)-> e.name.startsWith("Al");
		Predicate<Employer> sFilter = (e)-> e.salary > 10000;
		
		System.out.print("[");
		for(Employer e : list){
			if(nFilter.and(sFilter).test(e)){
				System.out.print(e + " ");
			}
		}
		System.out.print("]");
	}
}

class Employer{
	String name;
	double salary;
	Employer(String s, double sal){
		name = s;
		salary = sal;
		
	}
	public String toString(){
		return name + " - " + salary;
	}
}
