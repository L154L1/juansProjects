// First off, the readObject() method is not available to the InputStream class, and since the ObjectInputStream has been upcast to InputStream, the code will not compile due to line C2. 
// Line C2 will also not compile because the return type of readObject() is of type Object and must be cast explicitly to Bird in order to be assigned to the Bird reference. 
// Furthermore, constructors and methods on line C1 throw checked IOExceptions that must be caught. Note that line C2 also throws ClassNotFoundException. 
// It should be noted that even if the compilation problems were resolved, the code would still throw an exception at runtime since the Bird class includes a Tail reference as a member, 
// and the Tail class does not implement Serializable.



package q3;

import java.io.*;
class Tail {}

public class Bird implements Serializable{

	private String name;
	private transient int age;
	private Tail tail;

	public String getName() { return name; }
	public Tail getTail() { return tail; }
	public void setName(String name) { this.name = name; }
	public void setTail(Tail tail) { this.tail = tail; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

	public void main(String[] args) {
	try(InputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("birds.dat")))) {	// C1
			Bird bird = is.readObject();																		// C2
		}

	}

}
