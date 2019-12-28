// The values in each case statement must be compile-time constant values of the same data type as the switch value. 
// This means you can only use literals, enum constants, or final constant variable of the same data type as switch value.



package p74_switch;

public class CaseValues {
	
	private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		switch(firstName) {
		case "Test":
			return 52;
		case middleName:	// does not compile - case value must be constant
			id = 5;
			break;
		case suffix:
			id = 0;
			break;
		case lastName:		// does not compile - case value must be constant. lastName is final but it's passed to the function.
			id = 8;
			break;
//		case 5:			// does not compile - data type mismatch
//			id = 7;
//			break;
//		case 'J':		// does not compile - data type mismatch
//			id = 10;
//			break;
//		case java.time.DayOfWeek.SUNDAY:	// does not compile - data type mismatch
//			id = 15;
//			break;
		}
		return id;
	}

}
