package p244_call_inherited_members;

public class Shark extends Fish {
	private int numberOfFins = 8;
	
	public Shark(int age) {
		super(age);
		this.size = 4;		// or super.size = 4;		
	}
	
	// 'this' or 'super' keyword may both be used for methods or variables defined in the parent class, 
	//	but only 'this' may be used for members defined in the current class.
	// The following 3 methods are equivalent.
	
	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.print(" and " + size + " meters long");
		System.out.print(" with " + numberOfFins + " fins");
		System.out.println();
	}
	
	public void displaySharkDetails2() {
		System.out.print("Shark with age: " + this.getAge());
		System.out.print(" and " + this.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
		System.out.println();
	}
	
	public void displaySharkDetails3() {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Shark shark = new Shark(10);
		
		shark.displaySharkDetails();
		shark.displaySharkDetails2();
		shark.displaySharkDetails3();
		
		System.out.println(name());		// call inherited static method
		
		System.out.println(test);
//		System.out.println(this.test);	// does not compile
//		System.out.println(super.test);	// does not compile
	}

}

class Fish {
	static int test;
	protected int size;
	private int age;
	
	public Fish(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public static String name() {
		return "Fish";
	}
}
