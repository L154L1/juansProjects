package p81_for_loops;

public class BasicForLoop {
	
	// infinite loop
	void loop1(){
		for(;;){
			System.out.println("Hello World");
		}
	}
	
	// multiple terms
	void loop2(){
		int x = 0;
		for(long y = 0, z = 4; x< 5 && y< 10; x++, y++){
			System.out.print(y + " ");
		}
	}
	
	// cannot redeclare variable in initialization block
	void loop3(){
		int x = 0;
		for(int y = 0, x = 4; x < 5 && y < 10; x++, y++){		// does not compile because of duplicated variable declaration.
			System.out.print(x + " ");
		}
	}
	
	// simply assign values in initialization block
	void loop4(){
		int x = 0;
		long y = 10;
		for(y = 0, x = 4; x < 5 && y < 10; x++, y++){		
			System.out.print(x + " ");
		}
	}
	
	// variables in initialization block must be of the same type
	void loop5(){
		for(long y = 0, int x = 4; x < 5 && y < 10; x++, y++){		// does not compile
			System.out.print(x + " ");
		}
	}
	
	void loop6(){
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++){		
			System.out.print(y + " ");
		}
		System.out.print(x); 	// does not compile - loop variables are not visible outside loop block.
	}
	
	void loop7(){
		int i = 0;
		for(int i = 0; i < 10; i++){		
			System.out.print(i + " ");
		}
		{int i = 2;}

	}
	
	int i = 9;
}
