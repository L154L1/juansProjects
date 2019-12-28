// while(false){} will not compile as it's unreachable code

package Test3Q16;

public class Program {

	public static void main(String[] args) {
		int k = 20;
		while(false){
			k = 30;
			System.out.println(k);
		}
	}

}
