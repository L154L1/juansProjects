package Test4Q16;

class MainClass{
	MainClass(){ System.out.print("Mainclass "); }
}

class SubClass extends MainClass{
	{ System.out.print("I "); }
	static { System.out.print("S "); }
	SubClass(int i){
		this();
		System.out.print("SubClass ");
	}
	SubClass(){
		super();
		System.out.print("SubClass ");
	}
}

public class SubSubClass extends SubClass {
	SubSubClass(String s){
		super();
		System.out.print("SubSubClass ");
	}
	public static void main(String[] args) {
		new SubSubClass("ABC");
	}
}


// S Mainclass I SubClass SubSubClass 