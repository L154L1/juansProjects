// When x==16, x will change to 5 then it increments to 6 by for update statement so that will create an endless loop.
// if changing for condition to x>6, it will end loop and print 10 11 12 13 14 15 5 


package Test4Q6;

class Program {

	public static void main(String[] args) {
		for(int x = 10; x>5; x++){
			if(x==16) x-=11;
			System.out.print(x+" ");
		}

	}

}
