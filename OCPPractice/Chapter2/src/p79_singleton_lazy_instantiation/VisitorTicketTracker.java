// It doesn't create singleton object when the class is loaded but rather the first time it is requested by a client.
// Lazy instantiation reduces memory usage and improves performance when an application starts up. Without lazy instantiation, it takes longer to load and consume more memory.
// The downside of lazy instantiation is that users may notice a delay the first time a particular type of resource is needed.
// getInstance() method is synchronized, which means only one thread will be allowed in the method at a time, ensuring that only one instance is created.

package p79_singleton_lazy_instantiation;

public class VisitorTicketTracker {
	
	private static VisitorTicketTracker instance;		// Cannot be marked final !!!
	private VisitorTicketTracker() {}
	
	// lazy instantiation of singleton class
	public static synchronized VisitorTicketTracker getInstance() {
		if(instance == null) {
			instance = new VisitorTicketTracker();
		}
		return instance;
	}
	
	// Data access methods

}
