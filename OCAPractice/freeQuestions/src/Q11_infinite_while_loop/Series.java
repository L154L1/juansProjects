package Q11_infinite_while_loop;

public class Series {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		for(int var : arr){
			int i = 1;
			while(i<=var);		// semi-colon here makes a single while loop statement. And it's a infinite loop.
				System.out.println(i++);			
		}

	}

}
