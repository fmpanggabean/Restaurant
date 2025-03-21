package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int totalPrice;
	
	public Visitor(String name) {
		this.name = name;
		System.out.println("Welcome, "+ "Mr/Ms. " + this.name + "!");
	}

	public void showTotalPrice() {
		System.out.println();
		System.out.println("Mr/Ms. " + this.name + "'s Total Price Today : " + Restaurant.formatIDR(this.totalPrice));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
