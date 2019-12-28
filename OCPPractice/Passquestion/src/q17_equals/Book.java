// Which statement is true?

// Answer: A. The program prints true.

package q17_equals;

public class Book {
	int id;
	String name;
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) {
		boolean output = false;
		Book b = (Book) obj;
		if(this.name.equals(b.name)) {
			output = true;
		}
		return output;
	}

	public static void main(String[] args) {
		Book b1 = new Book(101, "Java Programming");
		Book b2 = new Book(101, "Java Programming");
		System.out.println(b1.equals(b2));	// true
	}

}
