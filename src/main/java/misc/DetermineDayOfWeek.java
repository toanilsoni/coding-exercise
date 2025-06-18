
package misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetermineDayOfWeek {

	public static void main(String[] args) throws ParseException {

		String inputDate = "04/17/2022";
		SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyy");
		Date dt = df1.parse(inputDate);
		SimpleDateFormat df2 = new SimpleDateFormat("EEEE");
		String str = df2.format(dt);

		System.out.println(str);

	}

	public static void determineDayOfWeek(String[] votes) {
	}

}
