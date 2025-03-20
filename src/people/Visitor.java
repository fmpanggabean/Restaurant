package people;

import restaurant.Restaurant;

public class Visitor {
	private String visitorName;
	private int totalPrice;

	public Visitor(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorName() {
		return visitorName;
	}
	
	public void addPrice(int price) {
		totalPrice += price;
	}
	
	public void showTotalPrice() {
		System.out.println();
		System.out.println(visitorName + "'s Total Cost: " + Restaurant.formatIDR(totalPrice));
	}
}
