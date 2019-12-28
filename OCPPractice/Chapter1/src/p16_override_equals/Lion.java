package p16_override_equals;

public class Lion {
	
	private int idNumber;
	private int age;
	private String name;
	public Lion(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;		
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Lion)) return false;
		Lion otherLion = (Lion)obj;
		return this.idNumber == otherLion.idNumber;
	}
	
	/*	legal hashCode method
	public int hashCode() {
		return idNumber;
	}
	*/
	
	/*	illegal hashCode method
	public int hashCode() {
		return idNumber * 7 + age;
	}
	*/

	public static void main(String[] args) {
		Lion lion1 = new Lion(1001, 5, "Joe");
		Lion lion2 = new Lion(1029, 8, "Matty");
		Lion lion3 = new Lion(1001, 7, "Adam");
		System.out.println(lion1.equals(lion2));
		System.out.println(lion1.equals(lion3));
	}

}
