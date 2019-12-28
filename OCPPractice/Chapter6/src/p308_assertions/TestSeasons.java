package p308_assertions;

enum Seasons{
	SPRING, SUMMER, FALL, WINTER
}
public class TestSeasons {
	
	public static void test(Seasons s) {
		switch(s) {
			case SPRING:
			case FALL:
				System.out.println("shorter hours");
				break;
			case SUMMER:
				System.out.println("longer hours");
				break;
			default:
				assert false: "Invalid season";
		}
	}

	public static void main(String[] args) {
		test(Seasons.WINTER);

	}

}
