// What is the result?
// A. null
// B. A compilation error occurs.
// C. DogCatMouse
// D. [Dog, Cat, Mouse]

// Answer: B

package q148_stream_collect;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
	List<String> list = null;
	public void printValues() {
		System.out.print(getList());
	}
	public List<String> getList() { return list; }
	public void setList(List<String> newList) { list = newList; }
	

	public void test() {
		List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
		Test t = new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test::printValues);
		//t.getList().forEach(s -> printValues());	// this can compile
		//t.getList().forEach(s -> t.printValues());	// this can compile


	}
	
	public static void main(String[] args) {
		new Test().test();
	}

}
