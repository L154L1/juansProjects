package Test3Q39;

public class Program {

	public static void main(String[] args) {
		int x = 3, y = 5;
		String print = "";
		
		if(x<5)
			if(y>0)
				if(x<y)
					print +="1";
				else print +="2";
			else print +="3";
		else print +="4";
		System.out.println(print);

	}

}
