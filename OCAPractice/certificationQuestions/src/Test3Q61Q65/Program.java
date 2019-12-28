package Test3Q61Q65;

public class Program {
	//Q65
	static int x = 0b01;
	static int y = 0xF;
	//static int z = 028;	// Does not compile. For octal literal, we can only use 0-7 for a digit. 
	static int z = 027;

	public static void main(String[] args) {
		System.out.println(x+z+y);
		
		//Q61
		int []ints = new int[0b101];
		int len = ints.length;
		for(int i : ints)
		System.out.print(i);	//00000
	}
}
