// What is the result?
// A. Read Java Programming
//    View http:/ ebook.com/ebook
// B. Read Java Programming
//    Read http:/ ebook.com/ebook
// C. The EBook.java file fails to compile.
// D. The Test.java file fails to compile.

// Answer: D

package q81_private_method;

// Book.java
class Book{
	private String read(String bname) { return "Read " + bname; }
}

// EBook.java
class EBook extends Book {
	public String read(String url) { return "View " + url; }
}

// Test.java
public class Test {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.read("Java Programming");
		Book b2 = new EBook();
		b2.read("http://ebook.com/ebook");

	}

}
