package Test2Q54_exception;

public class Program {
	static Double x;
	public static void main(String[] args) {
		try{
			System.out.println(x.doubleValue());
		}finally{
			System.out.print("Done");
		}
	}
}
