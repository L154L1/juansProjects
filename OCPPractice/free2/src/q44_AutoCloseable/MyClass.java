// What is the result?
// A. An exception is thrown at line n2.
// B. 100
// C. A compilation error occurs because the try block is declared without a catch or finally block.
// D. A compilation error occurs at line n1.

// Correct Answer: B


package q44_AutoCloseable;

public class MyClass implements AutoCloseable{
	int test;
	public void close() {}
	public MyClass copyObject() { return this; }

	public static void main(String[] args) {
		MyClass obj = null;
		try(MyClass obj1 = new MyClass()) {
			obj1.test = 100;
			obj = obj1.copyObject();		//line n1
		}
		System.out.println(obj.test);		//line n2
		
	}

}

//100    
