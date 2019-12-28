// Local variables do not have a default value and contain garbage data until initialized. 
// Local variables must be initialized before use, otherwise will not compile.

package p29_local_variable_initialization;

public class P29 {
	public int notValid(){
		int y = 10;
		int x;
		int reply = x + y;	// does not compile
		return reply;
	}
	
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} 
		else {
			answer =2;
			//onlyOneBranch = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch);	// does not compile
	}

}
