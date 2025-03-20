package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int totalPrice;
	
	public Visitor(String name) {
		this.name = name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println("===== SHOW TOTAL PRICE =====");
		System.out.println("Visitor " + this.name + "'s Total Price: " + Restaurant.formatIDR(this.totalPrice));
		System.out.println();
	}
}
