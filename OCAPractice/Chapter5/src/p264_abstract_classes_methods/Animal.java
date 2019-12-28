package p264_abstract_classes_methods;

abstract class Animal {
	public abstract String getName();
}

abstract class BigCat extends Animal {
	public abstract void roar();
}

class Lion3 extends BigCat {
	public String getName() {
		return "Lion";
	}
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}

abstract class BigCat2 extends Animal {
	public String getName() {
		return "BigCat";
	}
	public abstract void roar();
}

class Lion2 extends BigCat2 {
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}
