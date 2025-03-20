package people;

import main.FormatUtils;
import restaurant.Order;

public class Visitor {

	private String name;
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void order(Order order) {
		totalPrice += order.getPrice();
	}

	public void showTotalPrice() {
		System.out.println(name + "'s Total Price: " + FormatUtils.formatIDR(totalPrice));
	}

}
