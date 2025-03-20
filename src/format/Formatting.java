package format;

import java.text.*;
import java.util.Locale;

public class Formatting {
	
    public static String formatIDR(int amount) { 

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

        return formatter.format(amount); 

    } 
}
