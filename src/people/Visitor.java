package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private Integer totalPrice = 0;

	public Visitor(String name) {
		super();
		this.name = name;
	}
	
	public void addPrice(Integer price) {
		totalPrice += price;
	}

	public void showTotalPrice() {
		System.out.println(String.format("%s total price : %s", this.name, Restaurant.formatIDR(this.totalPrice)));
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
