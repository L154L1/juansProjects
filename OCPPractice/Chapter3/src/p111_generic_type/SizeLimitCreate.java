// when you declare a class, you can make it generic by providing <T> following the class name.
// You can declare multiple generic types for a class.
// Static variable cannot be declared as generic type.

package p111_generic_type;

public class SizeLimitCreate<T, U> {
	private T contents;
	private U sizeLimit;
	//static T size;		// doesn't compile - static variable cannot reference to generic type. Generic types are non-static.
	public SizeLimitCreate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
}

class Elephant{}

class Test{
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Integer numPounds = 15_000;
		SizeLimitCreate<Elephant, Integer> c1 = new SizeLimitCreate<>(elephant, numPounds);

	}
}