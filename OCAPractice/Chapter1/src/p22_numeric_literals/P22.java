package p22_numeric_literals;

public class P22 {

	public static void main(String[] args) {
//		long max = 3123456789;	// does not compile - out of int range. The solution is add L at the end.
		long max2 = 3123456789L;
		long max3 = 3123456789l;
		
		// number systems
		System.out.println(56);		// 56
		System.out.println(0b11);	// 3
		System.out.println(017);	// 15
		System.out.println(0x1F);	// 31
		
		System.out.println();
		System.out.println(0B11);	// 3
		System.out.println(0X1F);	// 31
		
		// underscores in numbers to make them easy to read.
		// you can add underscores anywhere except at the beginning or end of a number literal, or right before/after a decimal point.
//		double notAtStart = _1000.00;	// does not compile	
//		double notAtEnd = 1000.00_;		// does not compile
//		double notByDecimal = 1000_.00;		// does not compile
//		double notByDecimal2 = 1000._00;		// does not compile
		double annoyingButLegal = 1_00_0.0_0;
		System.out.println(annoyingButLegal);
		
	}

}
