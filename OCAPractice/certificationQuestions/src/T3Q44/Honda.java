package T3Q44;

class Car{
	void aboutme() {
		System.out.println("I am a Car");
	}
}

class Honda extends Car {

	void aboutme() {
		super.aboutme();
		System.out.println("I am Honda");
	}
	public static void main(String[] args) {
		Honda h = new Honda();
		h.aboutme();
	}
}
