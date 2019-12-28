package q15;

public class VisitPark {
	enum AnimalsInPark {
		 SQUIRREL, CHIPMUNK, SPARROW;
		}

	public static void main(String[] args) {
		AnimalsInPark[] animals = AnimalsInPark.values();	// values() returns an array of enum values
		System.out.println(animals[1]);		// CHIPMUNK

	}

}
