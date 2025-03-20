package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Visitor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showTotalPrice() {
		System.out.println(name + ", Total Price : " + Restaurant.formatIDR(amount));
	}
	
}
