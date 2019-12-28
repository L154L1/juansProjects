// From Java SE 8, we can use catch box for multiple exceptions.
// But in blow catchbox we used ArithmeticException and Exception, 
// it results error since ArithmeticException is already caught by Exception.

package Test4Q58;

class Program {
	static Integer i;
	public static void main(String[] args) {
		try{
			System.out.println(i+10);
		}catch(ArithmeticException | Exception e){
			System.out.println("Exception");
		}

	}

}
