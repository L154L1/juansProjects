package q8;

public class Q8 {
	int a, b;

	public int test() {
		
		try{
			return a/b;
		}
		catch (RuntimeException e){
			return -1;
		}
		catch (ArithmeticException e){
			return 0;
		}
		finally{
			System.out.print("done");
		}

	}
	
	public static void main(String[] args){
		System.out.print(new Q8().test());
	}

}
