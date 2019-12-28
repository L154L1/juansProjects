package findPrimeNumbers;

public class Test {

	public static void main(String[] args) {
		Animal a1 = new Animal("Penguin", "black", 8, 'P');
		Animal a2 = new Animal("Wolf","brown", 10, 'W');
		
		a1 = new Animal("Penguin", "black", 8, 'P');
		
		a1 = a2;
		
//		Animal a1 = new Animal();
//		Animal a2 = new Animal();
		
		
//		System.out.println(a1.getColor());
//		System.out.println(a2.getColor());
//		
//		System.out.println(a1.age);
//		System.out.println(a2.age);
//		
//		System.out.println(a1.type);
//		System.out.println(a2.type);
		
		a1.eat("fish");
		a2.eat("meat");
		
		System.out.println(Animal.doMath(11, 5));
		System.out.println(Animal.count);
		
		System.out.println(a1.count);
		System.out.println(a2.count);
		
		

	}

}


class Animal{
	String name;
	String furColor;
	int age;
	char type;
	static int count = 5;
	
	Animal(String name, String furColor, int age, char type){
		this.name = name;
		this.furColor = furColor;
		this.age = age;
		this.type = type;
	}
	
	String getColor() {
		return furColor;
	}
	
	static int doMath(int a, int b) {
		return a+b;
	}
	
	void eat(String food) {
		System.out.println(name + " eats " + food);
	}
}
