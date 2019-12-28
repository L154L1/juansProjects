// What is the result ?
// A. Sam John Jim
// B. John Jim
// C. A compilation error occurs at line n1
// D. A compilation error occurs at line n2

// Answer : B

package q64_stream_map;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp {
	private String eName;
	private Integer eAge;
	
	Emp(String eN, Integer eA){
		this.eName = eN;
		this.eAge = eA;
	}
	
	public Integer getEAge() { return eAge; }
	public String getEName() { return eName; }

	public static void main(String[] args) {
		List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
		Predicate<Emp> agVal = s -> s.getEAge() > 50;					//line n1
		li = li.stream().filter(agVal).collect(Collectors.toList());
		Stream<String> names = li.stream().map(Emp::getEName);			//line n2		// mapper returns a Stream<String>
		names.forEach(n -> System.out.print(n + " "));		// John Jim 

	}

}
