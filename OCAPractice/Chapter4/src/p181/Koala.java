package p181;

public class Koala {
	
	public static int count = 0;
	public static void main(String[] args) {
		System.out.println(count);
		
//		Koala.main(new String[0]);	// call static method
		
		// p182 you can use an instance of object to access static member. 
		// Java reads that static variable and doesn't care the instance of object,
		// even it's null, it doesn't matter.
		Koala k = new Koala();
		System.out.println(k.count);
		k = null;
		System.out.println(k.count);
		
		// p183
		Koala.count =4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count);
	}

}
