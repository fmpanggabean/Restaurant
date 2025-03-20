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
	
	public void addPrice(int cost) {
		totalPrice += cost;
	}
	
	public void showTotalPrice() {
		System.out.println("\n" + name + "'s total price: " + Restaurant.formatIDR(totalPrice));
	}
	
}
