// What is the result?
// A. A compilation error occurs at line n2.
// B. A compilation error occurs because the try block doesn’t have a catchor finally block.
// C. A compilation error occurs at line n1.
// D. The program compiles successfully.

// Answer: A

// DataConverter needs to implement AutoCloseable to use try-with-resource statement.

package q95_try_with_resource;

public class DataConverter {
	public void copyFlatFilesToTable() {}
	public void close() throws Exception{
		throw new RuntimeException();		//line n1
	}

	public static void main(String[] args) throws Exception{
		try(DataConverter dc = new DataConverter()) {	//line n2
			dc.copyFlatFilesToTable();
		}

	}

}
