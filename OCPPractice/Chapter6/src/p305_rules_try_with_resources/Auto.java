//p305 two new rules for the order in which code runs in a try-with-resources :
//- Resources are closed after the try clause ends and before any programmer coded catch/finally clause.
//- Resources are closed in the reverse order from which they were created.

package p305_rules_try_with_resources;

public class Auto implements AutoCloseable {
	int num;
	Auto(int num){this.num = num;}
	
	public void close() {
		System.out.println("Close:" + num);
	}

	public static void main(String[] args) {
		try(Auto a1 = new Auto(1); Auto a2 = new Auto(2)){
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("ex");
		}finally {
			System.out.println("finally");
		}

	}

}

//Close:2
//Close:1
//ex
//finally


