// use ofYearDay() method to create an instance of LocalDate.

package Test4Q48;
import java.time.*;
class Program {

	public static void main(String[] args) {
		LocalDate date = LocalDate.ofYearDay(2015, 365);
		System.out.print(date);
	}

}
