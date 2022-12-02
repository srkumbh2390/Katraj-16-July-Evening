package integer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalizedStyleDateTime {

	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted = current.format(formatter);
		
		System.out.println("Current Date is: " + formatted);
		

	}

}
