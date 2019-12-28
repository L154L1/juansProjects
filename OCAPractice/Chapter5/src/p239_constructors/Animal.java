// In Java, the first statement of every constructor is either a call to another constructor within the same class using this(), 
// or a call to a constructor in the direct parent class using super().
// If you don't explicitly declare super() in the constructor, make sure the direct parent class has no-argument constructor that the child class can call.


package p239_constructors;

class Animal {
	private int age;
	public Animal(int age) {
		super();		// calls the no-argument constructor of parent class which is java.lang.Object
						// if omitted, java will insert it for you.
		this.age = age;
	}
}

class Zebra extends Animal {
	public Zebra(int age) {
		super(age);
	}
	
	public Zebra() {
		this(4);
	}
}
