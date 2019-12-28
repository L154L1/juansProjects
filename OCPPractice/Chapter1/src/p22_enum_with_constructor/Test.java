package p22_enum_with_constructor;

enum Season1 {
	WINTER("low"), SPRING("medium"), SUMMER("high"), FALL("medium");
	private String visitors;
	private Season1(String visitors) {
		this.visitors = visitors;
	}
	public void printVisitors() {
		System.out.println(visitors);
	}
}

enum OnlyOne {
	ONE(true);
	private OnlyOne(boolean b) {
		System.out.println("constructing");
	}
}

// If enum itself has an abstract method, every enum value is required to implement this method, otherwise will get compiler error.
enum Season2 {
	WINTER {
		public void printHours() { System.out.println("9am-3pm"); }
	}, 
	SPRING {
		public void printHours() { System.out.println("9am-5pm"); }
	}, 
	SUMMER {
		public void printHours() { System.out.println("9am-7pm"); }
	}, 
	FALL {
		public void printHours() { System.out.println("9am-5pm"); }
	};
	public abstract void printHours();
	
}

// We can create a default implementation and override it only for the special values.
enum Season3 {
	WINTER {
		public void printHours() { System.out.println("short hours"); }
	}, 
	SUMMER {
		public void printHours() { System.out.println("long hours"); }
	}, SPRING, FALL;
	public void printHours() { System.out.println("default hours"); }
}

public class Test {

	public static void main(String[] args) {
		Season1.SUMMER.printVisitors();  // high
		
		// Java only construct the enum value the first time we ask for that value. After that it just returns the already-constructed enum value.
		OnlyOne first = OnlyOne.ONE;	// constructing
		OnlyOne second = OnlyOne.ONE;	// doesn't print anything
		
		// test Season2
		Season2.SUMMER.printHours();
		
		// test Season3
		Season3.SPRING.printHours();

	}

}
