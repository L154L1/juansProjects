package p74_switch;

public class BreakSwitch {

	public static void main(String[] args) {
		int dayOfWeek = 5;
		
		switch(dayOfWeek) {
			default :
				System.out.println("Weekday");
				break;
			case 0 :
				System.out.println("Sunday");
				break;
			case 6 :
				System.out.println("Saturday");
				break;
		}
		// Weekday
		
		System.out.println();
		
		switch(dayOfWeek) {
			case 0 :
				System.out.println("Sunday");
			default :
				System.out.println("Weekday");
			case 6 :
				System.out.println("Saturday");
		}
		//	Weekday
		//	Saturday
	}

}
