package p25_member_inner_class;

public class Outer {
	
	private String greeting = "Hi";
	
	protected class Inner{
		public int repeat = 3;
		
//		static int j = 0;			// doen't compile
//		static final int k = 0;		// compiles
		
		public void go() {
			for(int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		// can instantiate Inner directly within an instance method.
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
//		outer.callInner();
		
		// Within a static method, instantiate Inner - must associate to an outer instance
		Inner inner = outer.new Inner();
		inner.go();

	}

}
