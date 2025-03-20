package main;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatUtils {
	
	private static NumberFormat formatter = 
			NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
	
	public static String formatIDR(int number) {
		return formatter.format(number);
	}
}
