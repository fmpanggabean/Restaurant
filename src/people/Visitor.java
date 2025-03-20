package people;

import restaurant.Restaurant;

public class Visitor {

	private String name;
	private int totalPrice = 0;
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addTotalPrice(int totalPrice) {
		this.totalPrice = this.totalPrice + totalPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void showTotalPrice() {
		System.out.println(name + " Total Price : " + Restaurant.formatIDR(totalPrice));
		
	}

}
