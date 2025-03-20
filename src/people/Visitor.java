package people;

import java.text.NumberFormat;
import java.util.Locale;

public class Visitor {
	private String name;
	private int totalPrice;

	public Visitor(String name) {
		this.name = name;
	}

	public String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);
	}
	
	public String getName() {
		return name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void addTotalPrice(int totalPrice)
	{
		this.totalPrice += totalPrice;
	}
	
	public void showTotalPrice()
	{
		System.out.println("-- Visitor --");
		System.out.printf("- Name : %s\n", this.name);
		System.out.printf("- Total Price : %s\n", formatIDR(this.totalPrice));
		System.out.println();
	}
}
