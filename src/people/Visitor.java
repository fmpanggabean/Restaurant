package people;

import restaurant.*;
import java.util.ArrayList;

public class Visitor {
	private String name;
	private int totalPrice = 0;

	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addBill(int amount) {
		totalPrice += amount;
	}
	
	public void showTotalPrice() {
		System.out.println("  Total price of "+name +" "+totalPrice);
	}
}
