package main;

import java.text.NumberFormat;
import java.util.Locale;

public class Helper {
	public static String formatIDR(int value) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(value).replace(",00", "");
	}
}
