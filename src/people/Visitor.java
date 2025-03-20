package people;

import java.text.NumberFormat;
import java.util.Locale;

public class Visitor {
	private String name;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private int totalPrice;
	
	public void setTotalPrice(int price) {
		totalPrice += price;
	}
	
	public static String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);
	}
	
	public void showTotalPrice() {
		System.out.println(name + "'s total price: " + formatIDR(totalPrice));
	}
}