package p88_nested_loops;

public class Continue {

	public static void main(String[] args) {
		FIRST_CHAR_LOOP: for(int a = 1; a <= 4; a++){
			for(char x = 'a'; x <= 'c'; x++){
				if(a == 2 || x == 'b' ){
					continue FIRST_CHAR_LOOP;		//  1a 3a 4a
					//continue;			//  1a 1c 3a 3c 4a 4c
					// without continue statement - 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
				}									
				System.out.print(" " + a + x);
			}
		}
	}
}
