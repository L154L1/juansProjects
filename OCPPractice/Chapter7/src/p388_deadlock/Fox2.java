//p390 One common strategy to avoid deadlocks is for all threads to order their resource requests.

// This program resolved the previous deadlock by accessing the resources in a same order.
// It outputs :
//Got Food!
//Got Water!
//Got Food 2!
//Got Water 2!

package p388_deadlock;

import java.util.concurrent.*;

public class Fox2 {

	public void eatAndDrink(Food food, Water water) {
		synchronized(food) {
			System.out.println("Got Food!");
			move();
			synchronized(water) {
				System.out.println("Got Water!");
			}			
		}		
	}
	
	public void eatAndDrink2(Food food, Water water) {
		synchronized(food) {
			System.out.println("Got Food 2!");
			move();
			synchronized(water) {
				System.out.println("Got Water 2!");
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
		Fox2 foxy = new Fox2();
		Fox2 tails = new Fox2();
		Food food = new Food();
		Water water = new Water();
		
		// Process data
		ExecutorService service = null;
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> foxy.eatAndDrink(food, water));
			service.submit(() -> tails.eatAndDrink2(food, water));
		} finally {
			if(service != null) service.shutdown();
		}

	}

}
