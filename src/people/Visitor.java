package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int totalPrice;

	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addTotalPrice(int price) {
		totalPrice += price;
	}
	
	public void showTotalPrice() {
		System.out.println(name + " (Total Price : " + Restaurant.formatIDR(totalPrice) + ")");
	}

}
