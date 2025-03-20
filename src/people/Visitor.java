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

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice += totalPrice;
	}

	public void showTotalPrice() {
		System.out.println("\n================ BILL ================");
		System.out.println(""+name + " \t\t"+ Restaurant.formatIDR(totalPrice) +"");
		System.out.println("======================================");
	}
	
	
}
