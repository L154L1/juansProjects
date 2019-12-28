//Deadlock - occurs when two or more threads are blocked forever, each waiting on the other.


// The result is that our program outputs the following and it hangs indefinitely.
//Got Food!
//Got Water!


package p388_deadlock;

import java.util.concurrent.*;

class Food {}
class Water {}

public class Fox {
	
	public void eatAndDrink(Food food, Water water) {
		synchronized(food) {
			System.out.println("Got Food!");
			move();
			synchronized(water) {
				System.out.println("Got Water!");
			}			
		}		
	}
	
	public void drinkAndEat(Food food, Water water) {
		synchronized(water) {
			System.out.println("Got Water!");
			move();
			synchronized(food) {
				System.out.println("Got Food!");
			}			
		}		
	}
	
	public void move() {
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			//Handle exception
		}
	}
	

	public static void main(String[] args) {
		// Create participants and resources
		Fox foxy = new Fox();
		Fox tails = new Fox();
		Food food = new Food();
		Water water = new Water();
		
		// Process data
		ExecutorService service = null;
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> foxy.eatAndDrink(food, water));
			service.submit(() -> tails.drinkAndEat(food, water));
		} finally {
			if(service != null) service.shutdown();
		}

	}

}
