package p21_enum;

enum Season {
	WINTER, SPRING, SUMMER, FALL
}

public class Test {

	public static void main(String[] args) {
		
		// enum methods
		for(Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		// use enum in switch statement
		Season summer = Season.SUMMER;
		switch(summer) {
			case WINTER:
				System.out.println("Get out the sled!");
				break;
			case SUMMER:
				System.out.println("Time for the pool!");
				break;
			default:
				System.out.println("Is it summer yet?");
				
		}

	}

}
