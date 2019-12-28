// Passquestion q98

// Which is the valid definition of the Course enum?

// Answer: D

package q60_enum;

public class Test {
	
	// D.
	enum Course { JAVA(100), J2ME(150);
		private int cost;
		Course(int c){		// enum constructor can only be private (or default).
			this.cost = c;
		}
		int getCost() {
			return cost;
		}		
	}

	public static void main(String[] args) {
		for(Course a : Course.values()) {
			System.out.print(a + " Fees " + a.getCost() + " ");
		}

	}
	
	// B. doesn't compile
//	enum Course2 { JAVA(100), J2ME(150);
//		private static int cost;
//		private Course2(int c){		
//			this.cost = c;		// doesn't compile
//		}
//		static int getCost() {
//			return cost;
//		}		
//	}
	
	
}

