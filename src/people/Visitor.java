package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int prices;
	public Visitor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addPrice(int price) {
		prices+=price;
	}
	
	public void showTotalPrice() {
		System.out.println("");
		System.out.println("=======================BILL======================");
		System.out.println(name+" membeli dengan harga "+Restaurant.formatIDR(prices));
		System.out.println("=================================================");
	}
}
