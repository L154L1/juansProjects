//First here we have LocalDate instance and then invoking the atTime will combine passed time with LocalDate value, 
// and result will be LocalDateTime object, so we have to have LocalDateTime reference.

package Test3Q72;
import java.time.*;
public class Program {

	public static void main(String[] args) {
		LocalDate loc = LocalDate.of(2015, 1, 21);
		LocalDateTime ldt = loc.atTime(1, 1);
		System.out.print(ldt);
	}

}
