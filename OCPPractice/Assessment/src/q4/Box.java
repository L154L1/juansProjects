package q4;

public class Box<T> {
	T value;
	
	public Box(T value){
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}

	public static void main(String[] args) {
		Box<String> one = new Box<String>("A String");
		Box<Integer> two = new Box<>(123);
		System.out.println(one.getValue());
		System.out.println(two.getValue());

	}

}
