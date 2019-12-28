package p29_anonymous_inner_classes;

public class AnonInner1 {
	
	abstract class SaleTodayOnly{
		abstract int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {  // instantiate a new abstract class is ok here because we provide the implementation body right here - anonymously.
			
//			int i;						// compiles
//			static int j = 0;			// doen't compile
//			static final int k = 0;		// compiles
			
			int dollarsOff() { return 3; }
		};
		return basePrice - sale.dollarsOff();

	}
	
	public int admission2(int basePrice) {
		SaleTodayOnly2 sale = new SaleTodayOnly2() {  // instantiate a new abstract class is ok here because we provide the implementation body right here - anonymously.
			int dollarsOff() { return 3; }
		};
		return basePrice - sale.dollarsOff();

	}
		
}

abstract class SaleTodayOnly2{
	abstract int dollarsOff();
}
