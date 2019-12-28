package p239_constructors;

class Animal2 {
	private int age;
	private String name;
	public Animal2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Animal2(int age) {
		super();
		this.age = age;
		this.name = null;
	}
}

class Gorilla extends Animal2 {
	public  Gorilla(int age) {
		super(age, "Gorilla");
	}
	public Gorilla() {
		super(5);
	}
}
