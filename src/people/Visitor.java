package people;

import restaurant.Restaurant;

public class Visitor {

	private String name;
	private int price = 0;

	public Visitor(String visitor) {
		this.name = visitor;
	}

	public void showTotalPrice() {

		System.out.println(this.name+ " " + Restaurant.formatIDR(this.price));
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String visitor) {
		this.name = visitor;
	}
	
	public void addPrice(int price) {
		this.price += price;
	}

}
