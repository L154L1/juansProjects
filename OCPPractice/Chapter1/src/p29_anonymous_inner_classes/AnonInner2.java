package p29_anonymous_inner_classes;

public class AnonInner2 {
	
	interface SaleTodayOnly{
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {  // instantiate a interface is ok here because we provide the implementation body right here - anonymously.
			public int dollarsOff() { return 3; }	// must have public access because it's implementing method from an interface.
		};
		return basePrice - sale.dollarsOff();

	}
	
	public int admission2(int basePrice) {
		SaleTodayOnly3 sale = new SaleTodayOnly3() {  // instantiate a interface is ok here because we provide the implementation body right here - anonymously.
			public int dollarsOff() { return 3; }	// must have public access because it's implementing method from an interface.
		};
		return basePrice - sale.dollarsOff();

	}

}


interface SaleTodayOnly3{
	int dollarsOff();
}
