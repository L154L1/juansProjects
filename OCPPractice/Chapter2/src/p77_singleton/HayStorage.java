// An instance is accessed via a single public static method named getInstance()
// All constructors in a singleton class are marked private which ensures no other class is capable of instantiating another version of the class.
// By marking the constructors private, we have implicitly marked the class final - singleton class is effectively final.

package p77_singleton;

// singleton class
public class HayStorage {
	
	private int quantity = 0;
	private HayStorage() {}
	
	private static final HayStorage instance = new HayStorage();
	
	public static HayStorage getInstance() {
		return instance;
	}
	
	public synchronized void addHay(int amount) {
		quantity += amount;
	}
	
	public synchronized boolean removeHay(int amount) {
		if(quantity < amount) return false;
		quantity -= amount;
		return true;
	}
	
	public synchronized int getHayQuantity() {
		return quantity;
	}

}

// get an instance of singleton and access its data.
class LlamaTrainer{
	public boolean feedLlama(int numberOfLlamas) {
		int amountNeeded = 5 * numberOfLlamas;
		HayStorage hayStorage = HayStorage.getInstance();
		if(hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}
		boolean fed = hayStorage.removeHay(amountNeeded);
		if(fed) System.out.println("Llamas have been fed");
		return fed;
	}
}
