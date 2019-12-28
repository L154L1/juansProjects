package Test4Q46;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Program {

	public static void main(String[] args) {
		Year y = Year.of(2011);
		String day = y.atMonthDay(MonthDay.of(2, 23)).format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(day);  //20110223
		
		String day2 = y.atMonthDay(MonthDay.of(2, 23)).format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(day2); //2011-02-23
	}

}
