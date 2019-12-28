package exceptiontest;

class EatTooMuch extends Exception{
	EatTooMuch(String message){
		super(message);
	}
}
class DrinkTooMuch extends RuntimeException{}

public class Cat {
	
	void eat(int fish) throws EatTooMuch {
		try {
			if(fish <5 ) System.out.println("eat " + fish + " fish");
			else throw new EatTooMuch("ah oh!");
		}catch(EatTooMuch e) {
			System.out.println("eat too much!!!");
			System.out.println(e.getMessage());
		}
		
	}
	
	void drink(int water) { 
		if(water <5 ) System.out.println("drink" + water);
		else throw new DrinkTooMuch();
	}

	public static void main(String[] args) throws EatTooMuch {
		Cat jerry = new Cat();
		jerry.eat(10);

	}

}
